package com.Kaas.driver.Factory;

import com.Kaas.driver.enumpackage.BrowserType;
import com.Kaas.driver.Manager.SeleniumGridBrowserManager.SeleniumGridChromeManager;
import com.Kaas.driver.Manager.SeleniumGridBrowserManager.SeleniumGridFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType== BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver():
                SeleniumGridFirefoxManager.getDriver();
    }
}
