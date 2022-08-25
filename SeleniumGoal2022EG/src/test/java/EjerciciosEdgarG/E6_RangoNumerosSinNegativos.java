package EjerciciosEdgarG;

public class E6_RangoNumerosSinNegativos {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 6.1:
		 * Genera un método que imprima los números de acuerdo a un rango de números, 
		 * el método recibirá dos parámetros enteros “minInterval”, “maxInterval”. 
		 * El método solo tiene que aceptar números positivos.
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
