package ru.rastorguev.info;

import jfork.nproperty.Cfg;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SystemInfo {

    @Cfg("chromeDriverPath")
    private String chromeDriverPath;
    @Cfg("website")
    private String website;
    @Cfg("threadCount")
    private int threadCount;
    @Cfg("clearSwitch")
    private String clearSwitch;
    @Cfg("timeOutInSeconds")
    private int timeOutInSeconds;
    @Cfg("timeOutInSecondsMun")
    private int timeOutInSecondsMun;
    @Cfg("testMod")
    private String testMod;

}
