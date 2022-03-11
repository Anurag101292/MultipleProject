package com.Kaas.driver.Factory;

import com.Kaas.driver.Manager.BrowserStackManager.BrowserStackChromeManager;
import com.Kaas.driver.Manager.BrowserStackManager.BrowserStackFirefoxManager;
import com.Kaas.driver.enumpackage.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    private  BrowserStackFactory(){}


    public static WebDriver getDriver(BrowserType browserType){
        return browserType== BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver():
                BrowserStackFirefoxManager.getDriver();
    }
}
