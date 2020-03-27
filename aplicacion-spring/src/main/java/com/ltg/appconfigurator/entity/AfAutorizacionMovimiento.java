package com.ltg.appconfigurator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AF_PARAMETRO")
public class AfAutorizacionMovimiento {

	@Id
	private String PARA_CODIGO;
	
	private String PARA_NOMBRE;

	public String getPARA_CODIGO() {
		return PARA_CODIGO;
	}

	public void setPARA_CODIGO(String pARA_CODIGO) {
		PARA_CODIGO = pARA_CODIGO;
	}

	public String getPARA_NOMBRE() {
		return PARA_NOMBRE;
	}

	public void setPARA_NOMBRE(String pARA_NOMBRE) {
		PARA_NOMBRE = pARA_NOMBRE;
	}
	
	
}
