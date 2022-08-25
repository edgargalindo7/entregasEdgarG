package EjerciciosEdgarG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PF_MainPage extends PF_Base {

	public PF_MainPage(WebDriver driver) {
		super(driver);
		
	}
	
	//GENERAR LOS OBJETOS
	By txtUserName = By.xpath("//input[contains(@name,'username')]");
	By txtPassword = By.xpath("//input[contains(@type,'password')]");
	By btnLogin = By.xpath("//button[@type='submit'][contains(.,'Login')]");
	By imgPerfil = By.xpath("//img[contains(@alt,'profile picture')]");
	By optionAdmin = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");	
	By btnRecordsFound = By.xpath("//i[contains(@class,'oxd-icon bi-chevron-right')]");
	By lblalertMessage = By.xpath("contains(text(), 'User Management')");
	By btnAdd = By.xpath("//button[@type='button'][contains(.,'Add')]");
	By userRole = By.xpath("//*[contains(text(),'User Role')]//following::div");
	By adminRole = By.xpath("//div[@role='option'][contains(.,'Admin')]");
	By addStatus = By.xpath("//div[@class='oxd-select-text-input'][contains(.,'-- Select --')]");
	By enableStatus = By.xpath("//div[@role='option'][contains(.,'Enabled')]");
	By nameEmployee = By.xpath("//input[contains(@placeholder,'Type for hints...')]");
	By txtaddUserName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
	By txtaddPassName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
	By txtconfPass = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
	By btnSaveUser = By.xpath("//button[@type='submit'][contains(.,'Save')]");
	By txtSearchUser = By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[2]");
	By btnsearchButton = By.xpath("//button[@type='submit'][contains(.,'Search')]");
	By lblStatusSearch = By.xpath("(//div[contains(.,'Enabled')])[13]");
	By txtSearchNameField = By.xpath("//div[@role='option'][contains(.,'Aaliyah  Haq')]");
	By barraButtons = By.xpath("//div[@class='oxd-form-actions'][contains(.,'* Required Cancel  Save')]");
	By messageUserName = By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][contains(.,'Enabled')]");
	By btnresetSearch = By.xpath("//button[@type='button'][contains(.,'Reset')]");
	By btnPencil = By.xpath("(//i[contains(@class,'oxd-icon bi-pencil-fill')])[28]");
	By boxSelector = By.xpath("(//div[contains(@role,'cell')])[1]");
	By trashIcon = By.xpath("//i[contains(@class,'oxd-icon bi-trash')]");
	By btnDeleteSelected = By.xpath("//button[@type='button'][contains(.,'Delete Selected')]");
	By dialBoxText = By.xpath("//div[contains(@role,'document')]");
	By btnYesDelete = By.xpath("//button[@type='button'][contains(.,'Yes, Delete')]");
	
	

	
	
	//METODO PARA ACCESAR Y NAVEGAR
	public void navegatorWeb(String userName, String userPass) {
		ValidateTitle("OrangeHRM");
		ValidateElement(txtUserName);
		implicitWait();
		typeData(txtUserName, userName);
		implicitWait();
		typeData(txtPassword, userPass);
		implicitWait();
		takeScreenshotPF("1.Credenciales");
		clickButton(btnLogin);
		implicitWait();
		clickButton(imgPerfil);
		takeScreenshotPF("2.Menu de usuario");
		implicitWait();
		clickButton(optionAdmin);
		implicitWait();
		takeScreenshotPF("3.Pagina Admin");
		implicitWait();
		
		
	}
	
	//VALIDAR EL ACCESO CORRECTO
	public boolean verifyAcces() {
		return validateAcces(imgPerfil);
	}
	
	//VALIDAR MENSAJE DE PAGINA ADMIN
	public boolean verifyAlertMessage() {
			return isDisplayed(lblalertMessage);
	
	}
	
	//ALTA DE USUARIO
	public void addUser (String employeeName, String usernameAdd, String passAdd, String confirmAddPass) throws InterruptedException {
		ValidateElement(btnAdd);
		implicitWait();
		clickButton(btnAdd);
		clickButton(userRole);
		clickButton(adminRole);
		clickButton(addStatus);
		clickButton(enableStatus);
		typeData(nameEmployee, employeeName);
		ValidateElement(txtSearchNameField);
		clickButton(txtSearchNameField);
		typeData(txtaddUserName, usernameAdd);
		//ValidateElementDes(messageUserName);
		Thread.sleep(3000);
		typeData(txtaddPassName, passAdd);
		typeData(txtconfPass, confirmAddPass);
		takeScreenshotPF("4.- Datos del usuario");
		clickButton(btnSaveUser);
		Thread.sleep(3000);
		
		
		
	}
		
	public void searchUser (String searchUser) {
		implicitWait();
		ValidateElement(btnsearchButton);
		typeData(txtSearchUser, searchUser);
		ValidateElement(btnsearchButton);
		takeScreenshotPF("5.-User name a buscar");
		clickButton(btnsearchButton);
		ValidateElement(lblStatusSearch);
		takeScreenshotPF("6.- Busqueda exitosa");
	}
	
	
	public void deleteUsername(String searchDeleteUser) {
		ValidateElement(txtSearchUser);
		ValidateElement(trashIcon);
		clickButton(boxSelector);
		takeScreenshotPF("8.- Listo para Eliminar");
		ValidateElement(btnDeleteSelected);
		clickButton(btnDeleteSelected);
		ValidateElement(btnYesDelete);
		takeScreenshotPF("9.- Seguro de Eliminar?");
		clickButton(btnYesDelete);
		
		
		
		
	}
		
	 
	
	
		
}

	
