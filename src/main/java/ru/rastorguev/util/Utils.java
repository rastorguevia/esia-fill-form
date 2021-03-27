package ru.rastorguev.util;

import org.openqa.selenium.WebElement;
import ru.rastorguev.pages.FormPage;

import java.nio.charset.Charset;

public class Utils {

    public static String utf8Charset(String str) throws Exception {
        return new String(str.getBytes("ISO-8859-1"), "UTF-8");
    }

    public static void clearAndFill(WebElement element, String str) {
        try {
            element.clear();
            element.sendKeys(utf8Charset(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
