package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class CimAltitud {

	@JsonProperty("cota")
	@NotEmpty(message = "cota is mandatory")
	private String cota;
	
	@JsonProperty("x")
	@NotEmpty(message = "x is mandatory")
	private String x;
	
	@JsonProperty("y")
	@NotEmpty(message = "y is mandatory")
	private String y;
	
	@JsonProperty("data")
	@NotEmpty(message = "data is mandatory")
	private String data;

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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
