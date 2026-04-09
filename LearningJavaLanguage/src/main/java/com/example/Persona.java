package com.example;

public class Persona extends Object {

	/*
	 * A continuacion las variables miembros de la clase, que se le llaman:
	 * propiedades, campos y atributos
	 */

	/*
	 * Modificadores de acceso:
	 * 
	 * 1- privado del paquete, es el por defecto 2- public => es accesible en todos
	 * los paquetes 3- private => es solo accesible por elementos de la misma clase,
	 * dentro de la propia clase, incluso un objeto o una instancia de la misma
	 * clase no puede acceder a las propiedades privadas 4- protected => herencia,
	 * que veremos posteriormente
	 * 
	 * IMPORTANTE !!! Una clase bien diseñada es aquella que tiene todos sus
	 * propiedades, o campos, privados y solamente se relaciona con el mundo
	 * exterior a traves de metodos publicos que acceden a dichas variables privadas
	 */

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private double salario;
	


	/* Constructores:
	 * 
	 * ¿Que es un constructor? Es un metodo (funcion que esta declarada dentro de la clase)
	 * que tiene el mismo nombre de la clase, y que se utiliza conjuntamente con el operador
	 * new para construir, instanciar, objetos.
	 * 
	 * Por defecto, si no te creas ningun otro constructor, la clase tiene disponible el 
	 * llamado constructor sin parametros. 
	 * 
	 * ¿Como es capaz dicho constructor sin parametros de construir un objeto si en el cuerpo
	 * de dicho constructor no hay nada de codigo?
	 * 
	 * La Respuesta es: Que todas las clases heredan de la clase Object, que es la madre
	 * de todas las clases, y por tanto el constructor sin parametros lo que hace es invocar
	 * al constructor de la clase Object para que le haga los deberes, es decir, le construya
	 * el objeto, que la propia clase no tiene ni idea que de como hacerlo */

	public Persona(String nombre, String primerApellido, String segundoApellido) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}

	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	
	public Persona(double salario) {
		super();
		this.salario = salario;
	}


	public Persona(String nombre, String primerApellido) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * Metodos Getter and Setter, son metodos publicos a traves de los cuales se
	 * pueden modificar las variable privadadas de la clase
	 */




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + "]";
	}

	
	
}
