package com.Kaas.driver.Manager.LocalManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class FireFoxManager {

    private FireFoxManager() {
    }

    public static WebDriver initFireFoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

}
