package com.tfm.springboot.api.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CimGetCims {
	
	private List<CimGetCimsCim> cims = null;

	public List<CimGetCimsCim> getCims() {
		return cims;
	}

	public void setCims(List<CimGetCimsCim> cims) {
		this.cims = cims;
	}

}
