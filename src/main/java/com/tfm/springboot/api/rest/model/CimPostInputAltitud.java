package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class CimPostInputAltitud {

	@JsonProperty("cota")
	@JsonPropertyDescription("cota code")
	@NotEmpty(message = "cota is mandatory")
	private String cota;
	
	@JsonProperty("x")
	@JsonPropertyDescription("x code")
	@NotEmpty(message = "x")
	private String x;
	
	@JsonProperty("y")
	@JsonPropertyDescription("y code")
	@NotEmpty(message = "y is mandatory")
	private String y;
	
	public String getCota() {
		return cota;
	}

	public void setCota(String cota) {
		this.cota = cota;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
}
