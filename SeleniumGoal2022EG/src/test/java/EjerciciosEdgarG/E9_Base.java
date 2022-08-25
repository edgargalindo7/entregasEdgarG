package EjerciciosEdgarG;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import com.selenium.base.GlobalVariables;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class E9_Base {
	
	private WebDriver driver;
	
	//1.-CREAR EL CONSTRUCTOR
	/*
	 * Construsctor
	 * @author Edgar Galindo
	 * @8/11/2022
	 */
	
	public E9_Base(WebDriver driver) {
		this.driver=driver;
	}
	
	//2.- CREAR EL METODO PARA EL CHROME DRIVER
	public WebDriver chromeDriver( ) {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	}
	
	//3.- CREAR EL ABRIR NAVEGADOR
	public void OpenBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//4.- CREAR LA ESPERA IMPLICIT
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	//5.- CREAR LA ESPERA EXPLICITA
	public void ValidateTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void ValidateElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	//6.- CLICK AL BOTON 'ADD NEW COMPUTER'
	public void clickButtonAdd(By Locator) {
		try {
		driver.findElement(Locator).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();		
		}
	}
	
	//7.- CAPTURAR INFORMACION EN CAMPOS DE ALTA
	public void typeField(By Locator, String text) {
		 driver.findElement(Locator).sendKeys(text);
		 
	}
	
	//VALIDAR EL TEXTO DE CONFIRMACION 
	public boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	//TOMAR SCREENSHOTS
	public String takeScreenshot(String fileName) {
		try {
			String pathFileName = GlobalVariables.PATH_SCREENSHOTS + fileName + ".png";
			Screenshot screenshot = new AShot().takeScreenshot(driver);
			ImageIO.write(screenshot.getImage(), "PNG", new File(pathFileName));
			return pathFileName;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
