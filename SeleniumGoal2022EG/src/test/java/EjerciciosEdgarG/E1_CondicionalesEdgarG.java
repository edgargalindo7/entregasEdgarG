package EjerciciosEdgarG;

public class E1_CondicionalesEdgarG {

	public static void main(String[] args) {
		
		/*
		 * Ejercicio #1
		 * 
		 * 1- Cambiar el tipo de variable de int a double.
		 * 2- Agregar la condicion cuando sea "Zona escolar"
		 */
		
		// Variables
		double velocidad = 30.5; // KM/h
		double zonaEscolar = 30.0; // Zona Escolar
		double limiteVelocidad = 80.0; // KM/h - Avenida
		boolean isCarretera = true;
		
		if(isCarretera==true) {
			limiteVelocidad = 100.0;
			
			if(velocidad>limiteVelocidad) {
				System.out.println("Carretera - Multa");
			}else {
				System.out.println("Carretera - Manejas bien!!");
			}
			
		}else if(velocidad>limiteVelocidad) {
			System.out.println("Calle - Multa");
		}else {
			System.out.println("Calle - Manejas bien!!");

		}if(velocidad>zonaEscolar) {
			System.out.println("Zona Escolar - Multa");
		}else {
			System.out.println("Zona Escolar - Manejas Bien!!");
		}
		

			
		
		}
		
		
		
		

	}

