package com.Kaas.driver.Manager;

import com.Kaas.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.Kaas.driver.enumpackage.BrowserType.FIREFOX;

public  final class SeleniumGridFirefoxManager {

    private SeleniumGridFirefoxManager(){}
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(FIREFOX));
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridUrl(),capabilities);
    }
}
