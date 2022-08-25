package EjerciciosEdgarG;

public class E3_ArraysEdgarG {

	public static void main(String[] args) {
		// Ejercicio # 3 - Crear un arreglo unidimensional (como objeto) de 4 posiciones:
		// 1- First Name
		// 2- Last Name
		// 4- Edad
		
		// Imprimir el arreglo concatenando sus valores
		
		String[] infoPer = {"Datos Personales: ","Edgar","Galindo","41"};
		System.out.println(infoPer[0]+" "+infoPer[1]+" "+infoPer[2]+" "+infoPer[3]);
		
		String[] infoPer2 = new String[4];
		
		infoPer2[0] = "Datos Personales: ";
		System.out.println(infoPer[0]);
		infoPer2[1] = "Edgar";
		System.out.println("Nombre: " + infoPer[1]);
		infoPer2[2] = "Galindo";
		System.out.println("Apellido: " + infoPer[2]);
		infoPer2[3] = "41";
		System.out.println("Edad: " + infoPer[3]);

}
}
