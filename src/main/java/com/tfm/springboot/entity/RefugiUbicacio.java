package com.tfm.springboot.entity;

public class RefugiUbicacio {
	private String latitud;
	private String longitud;
	private String comentaris;
	private String Altitud;
	
	public RefugiUbicacio() {}
	
	public RefugiUbicacio(String latitud, String longitud, String comentaris, String altitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.comentaris = comentaris;
		Altitud = altitud;
	}

	public String getLatitud() {
		return latitud;
	}
	public RefugiUbicacio setLatitud(String latitud) {
		this.latitud = latitud;
		return this;
	}
	public String getLongitud() {
		return longitud;
	}
	public RefugiUbicacio setLongitud(String longitud) {
		this.longitud = longitud;
		return this;
	}
	public String getComentaris() {
		return comentaris;
	}
	public RefugiUbicacio setComentaris(String comentaris) {
		this.comentaris = comentaris;
		return this;
	}
	public String getAltitud() {
		return Altitud;
	}
	public RefugiUbicacio setAltitud(String altitud) {
		Altitud = altitud;
		return this;
	}

	@Override
	public String toString() {
		return "Ubicacio [latitud=" + latitud + ", longitud=" + longitud + ", comentaris=" + comentaris + ", Altitud="
				+ Altitud + "]";
	}
}
