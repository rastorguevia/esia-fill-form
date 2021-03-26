package ru.rastorguev.util;

import java.nio.charset.Charset;

public class Utils {

    public static String utf8Charset(String str) throws Exception {
        return new String(str.getBytes("ISO-8859-1"), "UTF-8");
    }

}
