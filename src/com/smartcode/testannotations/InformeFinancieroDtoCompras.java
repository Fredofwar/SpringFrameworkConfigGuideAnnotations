package com.smartcode.testannotations;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero{

	@Override
	public String getInformeFinanciero() {
		return "Informae financiero del departamento de compras año 2018";
	}

}
