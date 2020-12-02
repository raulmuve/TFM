package com.tfm.springboot.api.entity;

public class CimInformacioGeneral {
	
	private String codi;
	private String municipi;
	private String comarca;

	public CimInformacioGeneral() {}
	
	public String getCodi() {
		return codi;
	}

	public CimInformacioGeneral setCodi(String codi) {
		this.codi = codi;
		return this;
	}

	public String getMunicipi() {
		return municipi;
	}

	public CimInformacioGeneral setMunicipi(String municipi) {
		this.municipi = municipi;
		return this;
	}

	public String getComarca() {
		return comarca;
	}

	public CimInformacioGeneral setComarca(String comarca) {
		this.comarca = comarca;
		return this;
	}

	@Override
	public String toString() {
		return "CimAltitud [codi=" + codi + ", municipi=" + municipi + ", comarca=" + comarca + "]";
	}


}
