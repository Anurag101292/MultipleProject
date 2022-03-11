package com.Kaas.driver.Manager.BrowserStackManager;

import com.Kaas.config.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackChromeManager {
    public static WebDriver getDriver() {

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("browsername","chrome");
        capabilities.setCapability("browserVersion","97.8");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackUrl(), capabilities);
    }
}
