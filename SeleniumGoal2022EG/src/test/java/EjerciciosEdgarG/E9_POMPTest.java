package EjerciciosEdgarG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E9_POMPTest {
	
	WebDriver driver;
	E9_Base base;
	E9_AddScreen addScreen;
	
	
	
  @BeforeTest
  public void beforeTest() {
	  base = new E9_Base(driver);
	  driver = base.chromeDriver();
	  addScreen = new E9_AddScreen(driver);
		  
	  }
	
	
  @Test
  public void test001() {
	  
	  //ABRIR EL NAVEGADOR
	  base.OpenBrowser("https://computer-database.gatling.io/computers");
	  
	  //CREAR LA ESPERA IMPLICIT
	  base.implicitWait();
	  
	  //CREAR LA ESPERA EXPLICITA
	  base.ValidateTitle("Computers database");
	  
	  //CLICK EN ADD COMPUTER
	  addScreen.addComputer();
	  
	  //CREAR COMPUTADORA
	  addScreen.createComputer("Computadora1000","2021-07-13","2022-08-13" );
	  
	  //VALIDAR QUE SE AGREGO LA COMPUTADORA (ASSERT)
	  //Assert.assertTrue(addScreen.validateElement());
	  
	  
	  base.implicitWait();
	 
  }
  
   

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
