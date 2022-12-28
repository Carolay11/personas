package com.caro;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private int edad;
	private String colorDePelo;
	private LocalDate fechaDeNacimiento;

	// Constructor de clase (sabe como se crea una persona)
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	// metodo que devuelve el valor de un atributo
	public String getNombre() {
		return this.nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setcolorDePelo(String colorDePelo) {
		this.colorDePelo = colorDePelo;
	}

	public String getcolorDePelo() {
		return this.colorDePelo;
	}

	public void setfechaDeNacimiento(LocalDate fecha) {
		this.fechaDeNacimiento = fecha;
	}

	public LocalDate getfechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public void acariciar(Gato gato1) {
		System.out.println("Persona acaricia al gato");
		gato1.ponerseFeliz();
	}

}