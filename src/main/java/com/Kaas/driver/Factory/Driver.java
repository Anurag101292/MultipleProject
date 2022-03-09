package com.Kaas.driver.Factory;

import com.Kaas.driver.Factory.LocalFactoryDriver;
import com.Kaas.driver.enumpackage.BrowserType;
import org.openqa.selenium.WebDriver;

public class Driver {
   public static  WebDriver driver = null;

    public static WebDriver initdriver() {
      driver=  LocalFactoryDriver.initializeDriver(BrowserType.CHROME);
        driver.get("https://facebook.com");
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}
