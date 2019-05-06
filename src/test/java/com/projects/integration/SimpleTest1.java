package com.projects.integration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SimpleTest1 {
    @Test
public void openFacebook()
{
    System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
    Assert.assertEquals("Facebook - Log In or Sign Up",driver.getTitle());
    driver.findElementByCssSelector("input#email").sendKeys("sphoorthi");
    driver.findElementByCssSelector("input#pass").sendKeys("sphoorthi");
    driver.quit();
}
}
