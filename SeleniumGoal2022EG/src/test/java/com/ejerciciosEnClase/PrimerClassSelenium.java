package com.ejerciciosEnClase;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class PrimerClassSelenium {
	
	

  @Test
  public void f() {
	  
	  ChromeOptions chromeOpt = new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver(chromeOpt);
	  
	  driver.get("https://computer-database.gatling.io/computers"); 
	  
	  driver.findElement(By.id("searchbox")).sendKeys("ACE"); 
	  
	  
  }
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
