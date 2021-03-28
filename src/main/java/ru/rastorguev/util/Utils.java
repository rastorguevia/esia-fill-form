package ru.rastorguev.util;

import org.openqa.selenium.WebElement;

import static ru.rastorguev.constant.Constant.ONE;

public class Utils {

    public static String utf8Charset(String str) throws Exception {
        return new String(str.getBytes("ISO-8859-1"), "UTF-8");
    }

    public static void clearAndFill(WebElement element, String clearSwitch, String str) {
        try {
            if (ONE.equals(clearSwitch)) element.clear();
            element.sendKeys(utf8Charset(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
