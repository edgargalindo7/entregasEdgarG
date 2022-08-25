package EjerciciosEdgarG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class E9_AddScreen extends E9_Base {

	public E9_AddScreen(WebDriver driver) {
		super(driver);
		
	}
	
	//8.- GENERAR LOS OBJETOS (ELEMENTOS) EXISTENTES EN LA PAGINA
	By btnAddNewComp = By.xpath("//a[@id=\'add\']");
	By txtComputerName = By.id("name");
	By txtIntroduced = By.id("introduced");
	By txtDiscontinued = By.id("discontinued");
	By btnCreateComputer = By.xpath("//*[@id=\'main\']/form/div/input");
	By menssageDone = By.className("alert-message warning");
	
	
	
	//9.- CLICK AL BOTON ADD A NEW COMPUTER EN LA PAGINA PRINCIPAL
	public void addComputer() {
		clickButtonAdd(btnAddNewComp);
	}
	
	
	//10.- GENERAR UN METODO PARA CREAR LA NUEVA COMPUTADORA
	public void createComputer(String nomComp, String intDate, String discDate) {
		ValidateTitle("Computers database");
		ValidateElement(txtComputerName);
		typeField(txtComputerName, nomComp);
		takeScreenshot("createComputer");
		typeField(txtIntroduced, intDate);
		takeScreenshot("introduced");
		typeField(txtDiscontinued, discDate);
		takeScreenshot("discontinued");
		clickButtonAdd(btnCreateComputer);
		implicitWait();
		takeScreenshot("computerDone");
		
	}
	
	public boolean validateElement() {
			return isDisplayed(menssageDone);
		}
	
	
	
			
	}
	
	
	
	

