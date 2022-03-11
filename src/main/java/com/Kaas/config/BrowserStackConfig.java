package com.Kaas.config;

import com.Kaas.config.converters.StringtoUrlCoverter;
import org.aeonbits.owner.Config;

import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/browser-stack.properties"})

public interface BrowserStackConfig extends Config {

    @Key("username")
    String username();
    @Key("key")
    String key();
    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com")
    @ConverterClass(StringtoUrlCoverter.class)
    URL browserStackUrl();
}
