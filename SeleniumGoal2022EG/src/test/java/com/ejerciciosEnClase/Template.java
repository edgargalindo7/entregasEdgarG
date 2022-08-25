package com.ejerciciosEnClase;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Template {
  @Test
  public void f() {
	  
	  ChromeOptions chromeOpt = new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver(chromeOpt);
	  
	  driver.get("");
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
