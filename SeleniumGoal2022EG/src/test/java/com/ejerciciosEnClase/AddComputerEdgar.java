package com.ejerciciosEnClase;

import org.testng.annotations.Test;

import com.google.common.io.Closer;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AddComputerEdgar {
  @Test
  public void f() {
	  
	  ChromeOptions chromeOpt = new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver(chromeOpt);
	  
	  driver.get("https://computer-database.gatling.io/computers");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.titleContains("Computers database"));
	  	  
	  
	  
	  driver.findElement(By.xpath("//a[@id=\'add\']")).click();
	  driver.findElement(By.id("name")).sendKeys("Computadora de Edgar");
	  driver.findElement(By.id("introduced")).sendKeys("2021-07-13");
	  driver.findElement(By.id("discontinued")).sendKeys("2022-08-13");
	  driver.findElement(By.xpath("//*[@id=\'main\']/form/div/input")).click();

	  
	  driver.close();
	 
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
