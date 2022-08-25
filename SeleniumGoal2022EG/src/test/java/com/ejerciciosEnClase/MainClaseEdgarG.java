package com.ejerciciosEnClase;

//Genera un **método** que imprima los números de acuerdo a un rango de números, 
//el método recibirá dos parámetros enteros “minInterval”, “maxInterval”. 
//El método solo tiene que aceptar números positivos.
		

public class MainClaseEdgarG { 

	public static void main(String[] args) {
		
	
		valores(1,5);

	}
	
	public static void valores(int minInterval, int maxInterval) {
		
		if(minInterval<=0 || maxInterval<=0) {
			System.out.println("Numeros negativos no son validos");			
		}else {
			for(minInterval=1; minInterval<=maxInterval; minInterval++)
				System.out.println("Valor: " + minInterval);
		}
			
	
		
	}

}
