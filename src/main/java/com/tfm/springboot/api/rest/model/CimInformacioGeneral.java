package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class CimInformacioGeneral {
	
	@JsonProperty("codi")
	@NotEmpty(message = "codi is mandatory")
	private int codi;
	
	@JsonProperty("municipi")
	@NotEmpty(message = "municipi is mandatory")
	private String municipi;
	
	@JsonProperty("comarca")
	@NotEmpty(message = "comarca is mandatory")
	private String comarca;

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getMunicipi() {
		return municipi;
	}

	public void setMunicipi(String municipi) {
		this.municipi = municipi;
	}

	public String getComarca() {
		return comarca;
	}

	public void setComarca(String comarca) {
		this.comarca = comarca;
	}
	
}
