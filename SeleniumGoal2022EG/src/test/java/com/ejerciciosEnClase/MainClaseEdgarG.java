package com.ejerciciosEnClase;

//Genera un **m�todo** que imprima los n�meros de acuerdo a un rango de n�meros, 
//el m�todo recibir� dos par�metros enteros �minInterval�, �maxInterval�. 
//El m�todo solo tiene que aceptar n�meros positivos.
		

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
