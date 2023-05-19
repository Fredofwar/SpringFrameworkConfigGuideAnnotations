package com.smartcode.testannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotations {

	public static void main(String[] args) {
		
		// Cargar el xml de configuracion
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir un bean al contenedor
		Empleados Antonio = context.getBean("comercialExperimentado", Empleados.class);  //Nombre del bean comienza con minuscula
		
		// usar el bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTares());
		
		// cerrar el contexto 
		context.close();

	}

}
