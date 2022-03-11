package com.Kaas;

import com.Kaas.config.BrowserStackConfigFactory;
import com.Kaas.config.FrameWorkConfig;
import com.Kaas.driver.Factory.BrowserStackFactory;
import org.aeonbits.owner.ConfigCache;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void initDriver(){
    //    FrameWorkConfig config=  ConfigCache.getOrCreate(FrameWorkConfig.class);
  //   FrameWorkConfig config1=   ConfigFactory.create(FrameWorkConfig.class);
  //      System.out.println(config.browser());
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("www.google.com");
//        driver.quit();
        System.out.println(BrowserStackConfigFactory.getConfig().browserStackUrl());
    }
}
