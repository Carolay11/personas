package com.caro;

//*import java.time.LocalDate;

public class Aplicacion {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Caro");
		Gato gato1 = new Gato("Gris");
		System.out.println("El gato esta " + gato1.getEstadoEmocional());
		persona1.acariciar(gato1);
		System.out.println("El gato esta " +gato1.getEstadoEmocional());
		
		
		/*
		Gato gato1 = new Gato("Gris");
		String colordelgato = gato1.getcolorDePelo();
		System.out.println("El color del primer gato es: " + colordelgato);
		
		gato1.setnombre("Fute");
		String nombre = gato1.getnombre();
		System.out.println("El nombre del primer gato es; " + nombre);
		
		gato1.setEdad(2);
		int edad = gato1.getEdad();
		System.out.println("El nombre del primer gato es; " + edad);
		*/
		
		
		/*
		Persona persona1 = new Persona("Caro");
		String nombredelapersona = persona1.getNombre();
		System.out.println("El nombre de la persona es: " + nombredelapersona);
		persona1.setEdad(24);
		int edad = persona1.getEdad();
		System.out.println("El nombre de la persona es:" + edad);

		persona1.setcolorDePelo("Rojo");
		String colorDePelo = persona1.getcolorDePelo();
		System.out.println("El color de pelo de la persona es: " + colorDePelo);

		LocalDate fecha = LocalDate.of(1998, 12, 17);
		persona1.setfechaDeNacimiento(fecha);
		LocalDate fechaDeNacimiento = persona1.getfechaDeNacimiento();
		System.out.println("La fecha de nacimiento de " + nombredelapersona + " es: " + fechaDeNacimiento);
*/
		
	}

}
