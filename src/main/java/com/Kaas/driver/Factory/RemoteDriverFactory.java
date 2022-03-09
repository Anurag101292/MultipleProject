package com.Kaas.driver.Factory;

import com.Kaas.driver.enumpackage.BrowserRemoteModeType;

import com.Kaas.driver.enumpackage.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private  RemoteDriverFactory(){}
    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){


        if(browserRemoteModeType==BrowserRemoteModeType.SeleniumGrid){
            return SeleniumGridFactory.getDriver(browserType);
        }
        return null;
    }
}
