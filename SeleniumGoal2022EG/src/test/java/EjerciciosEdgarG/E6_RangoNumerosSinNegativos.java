package EjerciciosEdgarG;

public class E6_RangoNumerosSinNegativos {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 6.1:
		 * Genera un m�todo que imprima los n�meros de acuerdo a un rango de n�meros, 
		 * el m�todo recibir� dos par�metros enteros �minInterval�, �maxInterval�. 
		 * El m�todo solo tiene que aceptar n�meros positivos.
		 */
		 
		valores(1,20); 

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
