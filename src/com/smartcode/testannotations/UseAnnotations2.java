package com.smartcode.testannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAnnotations2 {

	public static void main(String[] args) {
		
		//Leer el xml de configuracion
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer el class de configuracion
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Pedir bean al contenedor xml
		Empleados Antonio = context.getBean("comercialExperimentado", Empleados.class);
		Empleados Lucia = context.getBean("comercialExperimentado", Empleados.class);
		
		if(Antonio == Lucia) {
			System.out.println("Apuntan al mismo lugar en memoria (Singleton Pattern)");
			System.out.println(Antonio+"\n"+Lucia);
		} else {
			System.out.println("No Apuntan al mismo lugar en memoria (Prototype Pattern)");
			System.out.println(Antonio+"\n"+Lucia);
		}
		
		
		Empleados empleado = context.getBean("directorFinanciero", Empleados.class);
		System.out.println(empleado.getTares());
		System.out.println(empleado.getInforme());
		
		DirectorFinanciero empleadoDirector = context.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Email del director: "+empleadoDirector.getEmail());
		System.out.println("Nombre de la empresa: "+empleadoDirector.getNombreEmpresa());
		
		context.close();
	}

}
