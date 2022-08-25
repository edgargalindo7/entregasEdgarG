package com.java;

public class Main {

	public static void main(String[] args) {
		
		//3.-SE DEBE INDICAR CON QUE CLASE SE QUIERE TRABAJAR Y SE CREAN LOS OBJETOS (EN ESTE CASO CREAMOS UN COCHE):
		
		Coche coche1 = new Coche();
		coche1.llantas = 4;
		coche1.asientos = 5;
		coche1.ac = true;
		coche1.marca = "BMW";
		coche1.modelo = "2020";
		coche1.motor = "Hibrido";
		
		System.out.println("El coche es modelo: " + coche1.modelo);
		
		//4.-COMPORTAMIENTOS (METODOS DE LA CLASE COCHE):
		
		coche1.encendido();
		coche1.acelerar();
		
		//6.-CREAR UN NUEVO COCHE CON PARAMETROS UTILIZANDO EL CONSTRUCTOR QUE ESTA EN LA CLASE Coche:  
		
		Coche coche2 = new Coche(2, 2, "Electrico",false, "Audi", "2022");
		System.out.println("El modelo del coche 2 es: " + coche2.modelo); 
		
		//8.-CREAR NUEVO COCHE CON EL NUEVO CONSTRUCTOR SOBRECARGADO
		
		Coche coche3 = new Coche(5,"2022"); 
		System.out.println("Mi coche 3 tiene " + coche3.llantas + " llantas");
		 
					

	} 

}
