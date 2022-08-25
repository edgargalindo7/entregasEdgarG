package EjerciciosEdgarG;

public class E5_MotosEdgarG {
	
	//EJERCICIO 5: CREAR UNA CLASE QUE SE LLAME MOTOS Y CREAR 3 DIFERENTES TIPOS DE MOTOS CON ESTADOS Y COMPORTAMIETOS.
	
	//1.-PARTES DE LA MOTO (ESTADOS):
	
	int llantas;
	String motor;
	boolean cadena;
	String transmicion;
	String modelo;
	
	//5.-CREAR CONSTRUCTOR
			
	public E5_MotosEdgarG(int llantas, String motor, boolean cadena, String transmicion, String modelo) {
		this.llantas = llantas; 
		this.motor = motor; 
		this.cadena = cadena;
		this.transmicion = transmicion;
		this.modelo = modelo; 
	}
	
	//CONSTRUCTOR VACIO 
	
	public E5_MotosEdgarG() {
		 
	}
	

	
		
		//2.-CREAR COMPORTAMIENTOS (METODOS):

	public void encendida() {
		System.out.println("La moto esta encendida"); 
	}
	
	public void apagada() {
		System.out.println("La moto esta apagada");
	}
	
	public void acelerando() {
		System.out.println("La moto esta acelerando");
	}
	
	public void frenando() {
		System.out.println("La moto esta frenando");
	}

}
