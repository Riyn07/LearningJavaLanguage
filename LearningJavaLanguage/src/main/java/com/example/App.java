package com.example;

public class App {
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		
		persona1.setNombre("Dani");
		
		System.out.println("El valor de la variable "
				+ "nombre para la referencia persona1 es: " + persona1.getNombre());
		
	}
}
