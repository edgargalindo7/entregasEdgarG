package EjerciciosEdgarG;

public class E7_PerroMainEdgar {


	public static void main(String[] args) {
		
		//Perro 1:
		
		E7_PerroEdgarG perro1 = new E7_PerroEdgarG();
		perro1.raza = "Pastor Aleman";
		perro1.sexo = "Macho";
		perro1.tamano = "Grande";
		
		System.out.println("La raza del perro 1 es: " + perro1.raza);
		System.out.println("El sexo del perro 1 es: " + perro1.sexo);
		System.out.println("El tamano del perro 1 es: " + perro1.tamano);
		
		System.out.println("**************************************");
		
		E7_PerroEdgarG perro2 = new E7_PerroEdgarG("ChauChau", "Mediano", "Hembra");
		System.out.println("La raza del perro 2 es: " + perro2.raza);
		System.out.println("El sexo del perro 2 es: " + perro2.sexo);
		System.out.println("La tamano del perro 2 es: " + perro2.tamano);
				

	}

}
