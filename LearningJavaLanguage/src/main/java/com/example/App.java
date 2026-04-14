package com.example;

public class App {
	
	public static void main(String[] args) {
		
		// Creacion de objetos Persona, a partir de la clase Persona
		
		Persona persona1 = new Persona();
		
		persona1.nombre = "Dani";
		
		Persona persona2 = new Persona();
		
		persona2.nombre = "Dani";
		
		new Persona().nombre = "Andres";
		
		/* persona1 y persona2 son iguales ???? */
		
		if (persona1 == persona2) 
			System.out.println("persona1 y persona2 apuntan al mismo objeto");
		else 
			System.out.println("persona1 y persona2 son variables de referencia "
					+ "que apuntan a objetos diferentes en la memoria RAM");
		
		
	}
}
