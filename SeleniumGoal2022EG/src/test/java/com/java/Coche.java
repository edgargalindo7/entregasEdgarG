package com.java;

public class Coche {
	
	//1.-PARTES DE UN COCHE (ESTADOS: SE REPRESENTA CON INSTANCIAS DE VARIABLE)
	
	int llantas;
	int asientos;
	String motor;
	boolean ac;
	String marca;
	String modelo;
	
	//5.-CREANDO UN CONSTRUCTOR (SIEMPRE DEBE LLEVAR EL MISMO NOMBRE QUE LA CLASE):
	
	public Coche(int llantas, int asientos, String motor, boolean ac, String marca, String modelo) {
		this.llantas = llantas; //CON ESTO (this) SE ASIGNAN LOS VALORES AL CONSTRUCTOR
		this.asientos = asientos;
		this.motor = motor;
		this.ac = ac;
		this.marca = marca;
		this.modelo = modelo;
		
	}
	
	//CONSTRUCTOR VACIO:
	
	public Coche() {
		
	}
	
	//7.-***SOBRECARGAR CONSTRUCTOR: SE PUEDE INDICAR UN VALOR DESDE EL CONSTRUCTOR Y QUITARLO DE LOS PARAMETROS 
	// 		ENTRE PARENTESIS (VARIABLES)
	// 		QUITAR llantas Y PONER 4, QUITAR ac Y PONER true LOS MISMO PARA 
	
	public Coche(int asientos, String modelo) {
		this.llantas = 4;
		this.asientos = asientos;
		this.motor = "Combustion interna";  
		this.ac = true;
		this.marca = "Nissan";
		this.modelo = modelo;
		
	}
	
	//2.-COMPORTAMIENTOS (SE REPRESENTA CON METODOS):
	
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}
	
	public void frenar() {
		System.out.println("El coche esta frenando");
	}
	
	public void encendido() {
		System.out.println("El coche ha encendido");
	}

}
