package com.Kaas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void initDriver(){
        FrameWorkConfig config=  ConfigCache.getOrCreate(FrameWorkConfig.class);
  //   FrameWorkConfig config1=   ConfigFactory.create(FrameWorkConfig.class);
        System.out.println(config.browser());
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("www.google.com");
//        driver.quit();
    }
}
