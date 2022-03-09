package com.Kaas.config.converters;

import com.Kaas.driver.enumpackage.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringtoBrowsertypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browsername) {
        return BrowserType.valueOf(browsername.toUpperCase());
    }
}
