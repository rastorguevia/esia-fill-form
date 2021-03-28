package ru.rastorguev.bootstrap;

import jfork.nproperty.ConfigParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.rastorguev.info.ChildInfo;
import ru.rastorguev.info.PersonInfo;
import ru.rastorguev.info.SystemInfo;
import ru.rastorguev.pages.FormPage;
import ru.rastorguev.thread.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static ru.rastorguev.constant.Constant.*;

public class Bootstrap {

    private final WebDriver webDriver;
    private final PersonInfo personInfo;
    private final ChildInfo childInfo;
    private final SystemInfo systemInfo;
    private final FormPage formPage;

    public Bootstrap() throws Exception {
        systemInfo = new SystemInfo();
        ConfigParser.parse(systemInfo, FILE_NAME);

        personInfo = new PersonInfo();
        ConfigParser.parse(personInfo, FILE_NAME);

        childInfo = new ChildInfo();
        ConfigParser.parse(childInfo, FILE_NAME);

        formPage = new FormPage();

        ChromeOptions options = new ChromeOptions();
        options.addArguments(START_MAXIMIZED);

        System.setProperty(DRIVER_PATH_KEY, systemInfo.getChromeDriverPath());
        webDriver = new ChromeDriver(options);
    }

    public void start() throws Exception {
        webDriver.get(systemInfo.getWebsite());
        PageFactory.initElements(webDriver, formPage);

        processPage();
    }

    private void processPage() throws Exception {

        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'container wrapper ccc ng-scope')]")));

        //TODO выбор муниципалитета?
        //TODO сделать выбор выпадающих списков


//        WebElement selectElement =
//                webDriver.findElement(By.id("ApplicantDocumentType"));


//        Select select = new Select(selectElement);
//        try {
//            select.selectByVisibleText("PASSPORT");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        ExecutorService es = Executors.newFixedThreadPool(systemInfo.getThreadCount());
        es.execute(new PersonDataThread(formPage, personInfo, systemInfo));
        es.execute(new PersonAddressThread(formPage, personInfo, systemInfo));
        es.execute(new ChildDataThread(formPage, childInfo, systemInfo));
        es.execute(new ChildAddressThread(formPage, childInfo, systemInfo));
        es.execute(new DropDownListThread(formPage, personInfo, childInfo));
        es.shutdown();
        es.awaitTermination(15, TimeUnit.SECONDS);

        try {
            formPage.captcha.click();
        } catch (Exception e) {
            e.printStackTrace();
        }










    }

}
