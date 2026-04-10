package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/* Empleado hereda de Persona, que es lo mismo que decir, que Empleado
 * es una subclase de Persona, que tambien es lo mismo que decir que 
 * Persona es la Super Clase o la clase Base de Empleado.
 * 
 * Y tambien se puede decir que Empleado es un Subtipo de Persona */
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class Empleado extends Persona {
	
	private double salario;
	private Dpto dpto;
	private LocalDate fechaAlta;
	
	// Numero de la Seguridad Social
	private String ssn;

}
