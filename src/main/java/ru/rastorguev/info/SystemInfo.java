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

}
