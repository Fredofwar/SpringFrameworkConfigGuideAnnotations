package com.smartcode.testannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * Ejemplo de uso de la anotacion @Autowired 
 */

//@Component("ComercialExperimentado") sino se le da nombre toma el nombre de la clase
@Component
//@Scope("prototype") //Esto cambia el patron de diseño singleton (que es el default) por prototype
public class ComercialExperimentado implements Empleados {
	
	//Ejecucion de codigo despues de creacion del bean (Solo funciona con singleton)
	/*
	 * Pueden tener cualquier modificador de acceso public, private, protected
	 * Pueden retornar cualquier tipo de dato
	 * Normalmente son void 
	 * No deben recibir argumentos
	 * */
	@PostConstruct 
	public void ejecucionDespuesCreacionBean() {
		System.out.println("Ejecutado tras creacion del Bean");
	}
	
	//Ejecucion de codigo despues de apagado contenedor Spring (Solo funciona con singleton)
	/*
	 * Pueden tener cualquier modificador de acceso public, private, protected
	 * Pueden retornar cualquier tipo de dato
	 * Normalmente son void 
	 * No deben recibir argumentos
	 * */
	@PreDestroy 
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutado antes de la destruccion");
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim4") //Con esta notacion se especifica a que clase hija se quiere inyectar ya que varias heredan de la misma interfaz
	private CreacionInformeFinanciero creacionInformeFinanciero; // Inyeccion por propiedad de clase (Concepto de reflexción)
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero creacionInformeFinanciero) { //Inyeccion por constructor
		this.creacionInformeFinanciero = creacionInformeFinanciero; 
	}*/
	
	/*@Autowired
	public void setCreacionInformeFinanciero(CreacionInformeFinanciero creacionInformeFinanciero) { //Inyeccion por metodo setter
		this.creacionInformeFinanciero = creacionInformeFinanciero; 
	}*/
	
	@Override
	public String getTares() {
		return "Vender, vender y vender";
	}

	@Override
	public String getInforme() {
		//return "Esto es un informe generado por el comercial";
		return creacionInformeFinanciero.getInformeFinanciero();
	}

}
