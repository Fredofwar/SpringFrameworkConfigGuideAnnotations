package com.smartcode.testannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * Configurar proyecto sin XML
 */

@Configuration
@ComponentScan("com.smartcode.testannotations")
@PropertySource("classpath:datosEmpresa.properties")
public class EmpleadosConfig {
	
	//Definir el bean para informeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {	//sera el id del bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	//Definir el nean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() { 
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
}
