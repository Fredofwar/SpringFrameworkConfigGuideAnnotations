package com.smartcode.testannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	@Autowired
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTares() {
		return "Gestion y direccion de operaciones financiereas de la empresa";
	}

	@Override
	public String getInforme() {
		return informeFinanciero.getInformeFinanciero();
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	

}
