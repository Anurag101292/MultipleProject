package com.Kaas.driver.Factory;

import com.Kaas.driver.Manager.SeleniumGridChromeManager;
import com.Kaas.driver.Manager.SeleniumGridFirefoxManager;
import com.Kaas.driver.Manager.SelenoidChromeManager;
import com.Kaas.driver.Manager.SelenoidFirefoxManager;
import com.Kaas.driver.enumpackage.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    private SelenoidFactory(){}


    public static WebDriver getDriver(BrowserType browserType){
        return browserType== BrowserType.CHROME
                ? SelenoidChromeManager.getDriver():
                SelenoidFirefoxManager.getDriver();
    }
}
