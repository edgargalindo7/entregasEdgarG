package com.selenium.poc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.base.BaseEdgar;
import com.selenium.base.GlobalVariables;

public class MainPOMEdgar {
	
	WebDriver driver;
	BaseEdgar base;
	MainPageEdgar mainPage;
	String expectedComputer;
	
  
  @BeforeTest
  public void beforeTest() {
	  base = new BaseEdgar(driver);
	  driver = base.chromeDriverCon();
	  mainPage = new MainPageEdgar(driver);
	  expectedComputer = base.getJSONValue("tc001", "computer");
	  
  }

  @Test
  public void test001() {
	  //STEP 1 LAUNCH BROWSER
	  base.launchBrowser(GlobalVariables.QA_URL);
	  
	  //STEP 2 INSERT COMPUTER NAME
	  //STEP 3 CLICK TO FILTER BY NAME
	  mainPage.filterComputerByName("expectedComputer");
	  
	  //STEP 4 VALIDATE COMPUTER IS DISPLAYED IN TABLE.
	  Assert.assertTrue(mainPage.verifyComputerTable("expectedComputer"));
  }
  
  @AfterTest
  public void afterTest() {
	  base.closeBrowser();
  }
  
  

}
