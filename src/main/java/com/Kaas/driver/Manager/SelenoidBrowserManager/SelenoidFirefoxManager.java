package com.Kaas.driver.Manager.SelenoidBrowserManager;

import com.Kaas.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenoidFirefoxManager {
    public static WebDriver getDriver() {

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("browsername","firefox");
        capabilities.setCapability("browserVersion","83");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(),capabilities);
    }
}
