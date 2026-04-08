package com.example;

public class Persona {

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

}
