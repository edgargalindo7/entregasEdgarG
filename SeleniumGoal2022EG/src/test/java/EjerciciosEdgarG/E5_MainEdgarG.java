package EjerciciosEdgarG;

public class E5_MainEdgarG {

	public static void main(String[] args) {
	
		//3.-CREAR OBJETOS DE LA MOTO:
		
		E5_MotosEdgarG moto1 = new E5_MotosEdgarG();
		moto1.llantas = 2;
		moto1.motor = "Gasolina";
		moto1.cadena = true;
		moto1.transmicion = "Automatica";
		moto1.modelo = "2022";
				
		//4.-COMPORTAMIENTO MOTO 1: 
		
		System.out.println("El modelo de la moto 1 es: "+ moto1.modelo);
		System.out.println("Es de "+ moto1.llantas + " llantas");
		System.out.println("La transmicion de la moto es: "+ moto1.transmicion);
				 
		moto1.apagada();
		moto1.encendida(); 
		moto1.acelerando();
		moto1.frenando();
		
		System.out.println("***********************************************************");
		
		//.-CREAR MOTO 2
		
		E5_MotosEdgarG moto2 = new E5_MotosEdgarG(3, "Electrica", false, "Manual", "2020");
		System.out.println("La moto 2 es de "+ moto2.llantas + " llantas"); 
		System.out.println("Es modelo " + moto2.modelo);
		System.out.println("Es " + moto2.motor);
		System.out.println("tiene transmicion "+ moto2.transmicion + "."); 
		  
		moto2.encendida();
		
		System.out.println("***********************************************************");
		
		
		//.- CREAR MOTO 3 
		
		E5_MotosEdgarG moto3 = new E5_MotosEdgarG(4, "Gasolina", true, "Automatica", "2019");
		System.out.println("Estado de la moto 3:");
		moto3.encendida();
		moto3.acelerando();
		System.out.println("Es de " + moto3.llantas + " llantas"); 
		System.out.println("La moto 3 tiene cadena?: " + moto3.cadena);
		System.out.println("El modelo de la moto es " + moto3.modelo);
		
		
		
 
	} 

}
