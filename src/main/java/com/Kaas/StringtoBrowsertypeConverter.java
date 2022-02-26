package com.Kaas;

import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Locale;

public class StringtoBrowsertypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browsername) {
        return BrowserType.valueOf(browsername.toUpperCase());
    }
}
