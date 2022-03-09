package com.Kaas.driver.Factory;

import com.Kaas.driver.enumpackage.BrowserType;
import com.Kaas.driver.Manager.ChromeManager;
import com.Kaas.driver.Manager.FireFoxManager;
import org.openqa.selenium.WebDriver;

import static com.Kaas.driver.enumpackage.BrowserType.*;

public final class LocalFactoryDriver {

    private LocalFactoryDriver() {
    }

    public static WebDriver driver = null;

    public static WebDriver initializeDriver(BrowserType browserType) {
        return (isaDriver(browserType)) ?
                ChromeManager.initChromeDriver() :
                FireFoxManager.initFireFoxDriver();
    }

    private static boolean isaDriver(BrowserType browserType) {
        return browserType == CHROME;
    }
}
