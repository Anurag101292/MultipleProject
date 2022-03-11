package com.Kaas.driver.Manager.SelenoidBrowserManager;

import com.Kaas.config.ConfigFactory;
import com.Kaas.driver.enumpackage.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenoidChromeManager {
    public static WebDriver getDriver() {

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("browsername","chrome");
        capabilities.setCapability("browserVersion","97.8");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
   return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(),capabilities);
    }
}
