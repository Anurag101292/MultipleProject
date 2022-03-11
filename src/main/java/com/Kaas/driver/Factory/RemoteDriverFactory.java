package com.Kaas.driver.Factory;

import com.Kaas.driver.enumpackage.BrowserRemoteModeType;

import com.Kaas.driver.enumpackage.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static final Map<BrowserRemoteModeType, Function<BrowserType, WebDriver>> MAP = new EnumMap<BrowserRemoteModeType, Function<BrowserType, WebDriver>>(BrowserRemoteModeType.class);
    public static Function<BrowserType, WebDriver> SELENIUM_GRID = SeleniumGridFactory::getDriver;
    public static Function<BrowserType, WebDriver> SELENIUM = LocalFactoryDriver::initializeDriver;
    public static Function<BrowserType, WebDriver> SELENOID = SelenoidFactory::getDriver;

    static {
        MAP.put(BrowserRemoteModeType.BrowserStack, SELENIUM);
        MAP.put(BrowserRemoteModeType.SeleniumGrid, SELENIUM_GRID);
        MAP.put(BrowserRemoteModeType.Selenoid, SELENOID);

    }


    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {

        return MAP.get(browserRemoteModeType).apply(browserType);
    }
}
