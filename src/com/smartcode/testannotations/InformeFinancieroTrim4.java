package com.smartcode.testannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe de cierre de año";
	}

}
