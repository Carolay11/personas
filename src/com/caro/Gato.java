package com.caro;

//Primero el nombre, despues color de pelo, y la edad.
public class Gato {
	private String nombre;
	private String colorDePelo;
	private int edad;
	private String estadoEmocional;

	public Gato (String colorDePelo) {
		this.colorDePelo= colorDePelo;
		this.estadoEmocional = "aburrido";
	}
	public String getcolorDePelo() {
		return this.colorDePelo;

	}
	
	public void setnombre (String nombre){
		this.nombre = nombre;
	}
	public String getnombre() {
		return this.nombre;
	}	
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	
	
	public void ponerseFeliz() {
		this.estadoEmocional = "Feliz";
	}
	public String getEstadoEmocional() {
		return this.estadoEmocional;
	}
	
}

