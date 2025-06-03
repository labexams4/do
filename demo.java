package com.testautomation.grid;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;

import java.net.URL;

public class SeleniumGridDemo {
  @Test

 public void runTestOnChrome() throws Exception {

 DesiredCapabilities capabilities = DesiredCapabilities.chrome();

 WebDriver driver = new RemoteWebDriver(new URL(" 

http://172.16.226.24:4444/wd/hub"), capabilities);

 

 driver.get("https://www.google.com");

 System.out.println("Page title on Chrome: " + driver.getTitle());

 driver.quit();

 }

 @Test

 public void runTestOnFirefox() throws Exception {

 DesiredCapabilities capabilities = DesiredCapabilities.firefox();

 WebDriver driver = new RemoteWebDriver(new URL(" 

http://172.16.226.24:4444/wd/hub"), capabilities);

 

 driver.get("https://www.google.com");

 System.out.println("Page title on Firefox: " + driver.getTitle());

 driver.quit();

 }

}
