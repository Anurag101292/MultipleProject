package com.Kaas;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
"file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties"})

public interface FrameWorkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringtoBrowsertypeConverter.class)
    BrowserType browser();
}
