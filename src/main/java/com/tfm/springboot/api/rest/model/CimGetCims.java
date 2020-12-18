package com.tfm.springboot.api.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CimGetCims {
	
	@JsonProperty("cims")
	private List<RefugiGetRefugisRefugi> cims = null;

	public List<RefugiGetRefugisRefugi> getCims() {
		return cims;
	}

	public void setCims(List<RefugiGetRefugisRefugi> cims) {
		this.cims = cims;
	}

}
