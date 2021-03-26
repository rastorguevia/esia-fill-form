package ru.rastorguev.info;

import jfork.nproperty.Cfg;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BrowserInfo {

    @Cfg("chromeDriverPath")
    private String chromeDriverPath;
    @Cfg("website")
    private String website;

}
