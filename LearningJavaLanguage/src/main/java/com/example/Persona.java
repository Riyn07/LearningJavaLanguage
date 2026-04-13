/*
 * ¿Que es la herencia?
 * 
 * Es un mecanismo, de reutilizacion del codigo, mediante el cual una clase puede heredar 
 * todos los elementos publicos o protected de otra clase.
 * 
 * Java, a diferencia de el lenguaje C++, solamente soporta la herencia simple de clase, 
 * es decir, que no puede heredar de mas de una clase, solamente puede heredar de una 
 * sola clase.
 * 
 * Todas las clases heredan de la clase Object.
 * 
 * MUY IMPORTANTE !!!! 
 * 
 * Los constructores no se heredan
 *
 * 
 * */


package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Persona  {

	/*
	 * Los elementos miembros de una clase (propiedades, metodos, los constructores)
	 * solamente pueden existir (vivir) en el plano de las clases o en el plano de las
	 * instancias
	 * 
	 * El elemento que vive, que existe, en el plano de las clases tiene que tener el 
	 * modificador static, y no necesita de una instancia de la clase para poder existir,
	 * y se accede al mismo prefejijandolo por el nombre de la clase */
	
	public static final String PAIS = "España";
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	private double salario;
	

}
