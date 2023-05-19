package com.smartcode.testannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe catastrofico del trimestre 2";
	}

}
