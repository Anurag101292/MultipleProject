package com.Kaas.driver.Manager.SeleniumGridBrowserManager;

import com.Kaas.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.Kaas.driver.enumpackage.BrowserType.CHROME;


public class SeleniumGridChromeManager {
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(CHROME));
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridUrl(),capabilities);
    }
}
