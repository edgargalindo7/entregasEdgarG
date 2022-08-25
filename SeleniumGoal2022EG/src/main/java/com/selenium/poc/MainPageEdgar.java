package com.selenium.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.BaseEdgar;

public class MainPageEdgar extends BaseEdgar{

	public MainPageEdgar(WebDriver driver) {
		super(driver);
		
	}
	
	//OBJECTS
	By txtFilterCompName = By.id("searchbox");
	By btnFilterByName = By.id("searchsubmit");
	By tblActualFirstRow = By.xpath("//tbody/tr[1]/td[1]");
	
	//METODO PARA FILTRAR POR NOBRE
	//@author Edgar Galindo
	//@8/10/2022
	
	public void filterComputerByName(String computer) {
		verifyTitleContains("Computers");
		verifyVisibilityElement(txtFilterCompName);
		type(txtFilterCompName, computer);
		click(btnFilterByName);
	}
	
	//VERIFICAR QUE SE DESPLIEGUE LA COMPUTADORA EN LA TABLA DESPUES DEL FILTRO
	public boolean verifyComputerTable(String expectedComputer) {
		String actualComputer = getText(tblActualFirstRow);
		if(expectedComputer.equals(actualComputer)) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
