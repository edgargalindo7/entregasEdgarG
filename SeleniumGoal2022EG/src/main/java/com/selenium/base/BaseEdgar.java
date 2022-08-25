package com.selenium.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseEdgar {
	
	private WebDriver driver;
	
	/*
	 * Constructor
	 * @author Edgar Galindo
	 * @param
	 * @return
	 * @throws
	 * @date
	 */
	
	public BaseEdgar(WebDriver driver) {
		this.driver = driver;
	}
	
	// CREAR CHROME DRIVER
	public WebDriver chromeDriverCon() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	
	}
	
	//LAUNCH BROWSER
	public void launchBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		implicitWait();
	}
	
	//IMPLICIT WAIT
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		
	}
	
	//EXPLICIT WAIT
	public void verifyTitleContains(String titleExpected) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(titleExpected));
	}
	public void verifyVisibilityElement(By objExpected) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(objExpected));
	}
	
	//TYPE
	public void type(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	//CLICK
	public void click(By locator) {
		try {
			driver.findElement(locator).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	//GET TEXT
	public String getText(By locator) {
		return driver.findElement(locator).getText();
		
	}
	
	//CLOSE BROWSER
	public void closeBrowser() {
		driver.close();
	}
	
	/**
	 * Get Data from JSON file (Directly)
	 * 
	 * @author Edgar Galindo
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONValue(String jsonFileObj, String jsonKey){
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}

}
