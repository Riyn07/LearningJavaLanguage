package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Persona  {

	// Modificacion realizada en un commit
	// para lo cual ha sido necesario la creacion de un rama
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	private double salario;
	
	
}
