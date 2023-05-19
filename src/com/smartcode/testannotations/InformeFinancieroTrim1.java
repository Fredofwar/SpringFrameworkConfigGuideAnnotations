package com.smartcode.testannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe financiero trimestre 1";
	}

}
