package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class RefugiUbicacio {

	@JsonProperty("latitud")
	@JsonPropertyDescription("latitud code")
	@NotEmpty(message = "latitud is mandatory")
	private String latitud;
	
	@JsonProperty("longitud")
	@JsonPropertyDescription("longitud code")
	@NotEmpty(message = "longitud is mandatory")
	private String longitud;
	
	@JsonProperty("comentaris")
	@JsonPropertyDescription("comentaris code")
	@NotEmpty(message = "comentaris is mandatory")
	private String comentaris;
	
	@JsonProperty("altitud")
	@JsonPropertyDescription("altitud code")
	@NotEmpty(message = "altitud is mandatory")
	private String altitud;
	
	@JsonProperty("latitud")
	public String getLatitud() {
		return latitud;
	}
	
	@JsonProperty("latitud")
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	
	@JsonProperty("longitud")
	public String getLongitud() {
		return longitud;
	}
	
	@JsonProperty("longitud")
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	
	@JsonProperty("comentaris")
	public String getComentaris() {
		return comentaris;
	}
	
	@JsonProperty("comentaris")
	public void setComentaris(String comentaris) {
		this.comentaris = comentaris;
	}
	
	@JsonProperty("altitud")
	public String getAltitud() {
		return altitud;
	}
	
	@JsonProperty("altitud")
	public void setAltitud(String altitud) {
		this.altitud = altitud;
	}
}
