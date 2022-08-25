package EjerciciosEdgarG;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.selenium.base.GlobalVariables;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class PF_Base {
	
	public WebDriver driver;
	
	//CREAR EL CONSTRUCTOR
	/*
	 * Construsctor
	 * @author Edgar Galindo
	 * @8/16/2022
	 * **PROYECTO FINAL SELENIUM**
	 */
	
	public PF_Base(WebDriver driver) {
		this.driver=driver;
	}
	
	//CREAR EL METODO PARA EL CHROME DRIVER
	public WebDriver chromeDriver( ) {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	}
	
	//ABRIR NAVEGADOR
	public void OpenBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//ESPERA IMPLICIT
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	public void implicitWait2(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	//ESPERA EXPLICITA
	public void ValidateTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void ValidateElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}
	
	public void ValidateElementDes(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}
	
	
	
	//ACCESAR A LA PAGINA CON EL LOGIN
	public void typeData(By Locator, String text) {
		 driver.findElement(Locator).sendKeys(text);
	}
	
	//CLICK PARA BOTONES
	public void clickButton(By Locator) {
		try {
		driver.findElement(Locator).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();		
		}
		
			
		
	}
	
	public boolean validateAcces(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	
	//GET TEXT
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
		
	//VALIDACION DE TEXTOS EN PAGINAS
	public boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	
	//TOMAR SCREENSHOTS
	public String takeScreenshotPF(String fileName) {
			try {
				String pathFileName = GlobalVariables.PATH_SCREENSHOTSPF + fileName + ".png";
				Screenshot screenshot = new AShot().takeScreenshot(driver);
				ImageIO.write(screenshot.getImage(), "PNG", new File(pathFileName));
				return pathFileName;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				return null;
			}
		}
				

	

}
