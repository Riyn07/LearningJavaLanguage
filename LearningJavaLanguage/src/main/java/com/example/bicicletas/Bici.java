/*
 * ¿Que es una interface? 
 * 
 * Es un conjunto de metodos abstractos, en principio, es decir
 * que no tienen implementacion, que no tienen cuerpo, relacionados 
 * 
 * El lenguaje Java si permite a una clase implmentar una o varias interfaces y esto
 * complementa que el lenguaje no permita la herencia multiple de clases.
 * 
 * Las interfaces son quizas mas importantes que las propias clases, porque, por ejemplo
 * el Framework de Colecciones son interfaces y tambien para desacoplar el codigo, que 
 * veremos mas adelante a traves de la inyeccion de dependencias en Spring lo que se 
 * utilizan son las interfaces */

/* Considera un empresa que se dedica a la fabricacion de bicicletas de montaña, de carrera,
 * acuaticas, de paseo, etc. 
 * 
 * Existen en dicha fabrica/empresa varios departamentos que se dedican a la fabricacion
 * de las bicicletas, pero el jefe de produccion quiere que cuando se diga frenar o embragar
 * o acelerar el nombre del metodo que realiza la accion sea el mismo y lo unico que cambie
 * sea la implementacion del metodo segun el tipo de bicicleta. Por ejemplo una bicicleta 
 * de carrera cuando acelera tiene que aumentar mas la velocidad que otro tipo de bicicleta
 * pero el metodo se tiene que llamar acelerar, igualmente. 
 * 
 * TECNICAMENTE: Una interfaz es un contrato mediante el cual una clase concreta que 
 * implemente una interfaz se compromete a implementar todos los metodos abstractos de la 
 * interfaz aunque solamente vaya a utilizar uno solo. 
 * 
 * 
 * IMPORTANTE !!! 
 * 
 * Cuando se implementa una interfaz, la firma del metodo no se puede 
 * violar 
 * 
 * La firma (signature) del metodo comprende el nombre y los parametros que recibe */

package com.example.bicicletas;

public interface Bici {
	
	void acelerar(double velocidad);
	public abstract void frenar(double velocidad);
	public abstract void embragar(int engrane);
}
