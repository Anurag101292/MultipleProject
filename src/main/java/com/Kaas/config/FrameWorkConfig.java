package com.Kaas.config;

import com.Kaas.config.converters.StringtoBrowsertypeConverter;
import com.Kaas.config.converters.StringtoUrlCoverter;
import com.Kaas.driver.enumpackage.BrowserRemoteModeType;
import com.Kaas.driver.enumpackage.BrowserType;
import com.Kaas.driver.enumpackage.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
"file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties"})

public interface FrameWorkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringtoBrowsertypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType runModeBrowser();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringtoUrlCoverter.class)
    URL seleniumGridUrl();

    @ConverterClass(StringtoUrlCoverter.class)
    URL selenoidURL();

}
