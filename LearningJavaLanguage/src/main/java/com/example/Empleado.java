package com.example;

import java.time.LocalDate;

/* Empleado hereda de Persona, que es lo mismo que decir, que Empleado
 * es una subclase de Persona, que tambien es lo mismo que decir que 
 * Persona es la Super Clase o la clase Base de Empleado.
 * 
 * Y tambien se puede decir que Empleado es un Subtipo de Persona */
public class Empleado extends Persona {
	
	private double salario;
	private Dpto dpto;
	private LocalDate fechaAlta;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(double salario, Dpto dpto, LocalDate fechaAlta) {
		super();
		this.salario = salario;
		this.dpto = dpto;
		this.fechaAlta = fechaAlta;
	}

	public Empleado(String nombre, String primerApellido, String segundoApellido, 
			Genero genero,
			LocalDate fechaNacimiento, double salario, Dpto dpto, LocalDate fechaAlta) {
		super(nombre, primerApellido, segundoApellido, genero, fechaNacimiento);
		this.salario = salario;
		this.dpto = dpto;
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", dpto=" + dpto + ", fechaAlta=" + fechaAlta + ", toString()="
				+ super.toString() + "]";
	}


	
	
	
	

}
