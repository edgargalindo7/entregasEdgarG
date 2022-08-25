package EjerciciosEdgarG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PF_POMPTest {
	
	 WebDriver driver;
	 PF_Base base;
	 PF_MainPage mainpage;
	 String perfilExpected;
	 By optionAdmin;
	 By imgPerfil;
	 By validateAdmin;
	 By tblAdminConfirm;
	 By userRole;
	 By adminRole;
	 By btnSaveUser;
	 By buttonSave;
	 
	 
	 
	 
	 
	 
	
 @BeforeTest
 	 public void beforeTest() {
		  base = new PF_Base(driver);
		  driver = base.chromeDriver();
		  mainpage = new PF_MainPage(driver);
	
			  
		  }
	
	
  @Test
  public void test01() throws InterruptedException {
	  
	  //IR A LA PAGINA 'ORANGE HRM'
	  base.OpenBrowser("https://opensource-demo.orangehrmlive.com/");
	  
	  //CAPTURAR CREDENCIALES Y ACCESAR
	  mainpage.navegatorWeb("Admin", "admin123");
	  
	  //ASSERT PARA VALIDAR EL ACCESO CORRECTO
	  Assert.assertTrue(mainpage.verifyAcces());
	  
	  //ALTA DE USER
	  mainpage.addUser("Aaliyah", "Edg.Aali23", "HolaEsUnaPrueba12!", "HolaEsUnaPrueba12!");
	  
	  
	  
	  //BUSQUEDA DE USER CREADO
	  mainpage.searchUser("Edg.Aali23");
	  
	 	  
	  //BORRAR EL REGISTRO AGREGADO
	  mainpage.deleteUsername("Edg.Aali23");
	  
	 	  
  	}
   
 
  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
