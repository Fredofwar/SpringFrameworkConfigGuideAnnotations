package com.smartcode.testannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe favorable del trimestre 3";
	}

}
