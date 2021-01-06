package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class CimPostInputInformacioGeneral {

	@JsonProperty("codi")
	@JsonPropertyDescription("codi code")
	@NotNull(message = "codi is mandatori")
	private Integer codi;
	
	@JsonProperty("municipi")
	@JsonPropertyDescription("municipi code")
	@NotNull(message = "municipi is mandatori")
	private String municipi;
	
	@JsonProperty("comarca")
	@JsonPropertyDescription("comarca code")
	@NotNull(message = "comarca is mandatori")
	private String comarca;

	public Integer getCodi() {
		return codi;
	}

	public void setCodi(Integer codi) {
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
