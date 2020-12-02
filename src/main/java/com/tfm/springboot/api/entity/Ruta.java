package com.tfm.springboot.api.entity;

import java.util.Date;

public class Ruta {

	private Integer id_Ruta;
	private String nom;
	private String descripcio;
	private String link;
	private boolean actiu;
	private Date dataCreacio;
	private Date dataModificacio;
	private Integer numeroConsultes;

	public Integer getId_Ruta() {
		return id_Ruta;
	}

	public Ruta setId_Ruta(Integer id_Ruta) {
		this.id_Ruta = id_Ruta;
		return this;
	}

	public String getNom() {
		return nom;
	}

	public Ruta setNom(String nom) {
		this.nom = nom;
		return this;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public Ruta setDescripcio(String descripcio) {
		this.descripcio = descripcio;
		return this;
	}

	public String getLink() {
		return link;
	}

	public Ruta setLink(String link) {
		this.link = link;
		return this;
	}

	public boolean isActiu() {
		return actiu;
	}

	public Ruta setActiu(boolean actiu) {
		this.actiu = actiu;
		return this;
	}

	public Date getDataCreacio() {
		return dataCreacio;
	}

	public Ruta setDataCreacio(Date dataCreacio) {
		this.dataCreacio = dataCreacio;
		return this;
	}

	public Date getDataModificacio() {
		return dataModificacio;
	}

	public Ruta setDataModificacio(Date dataModificacio) {
		this.dataModificacio = dataModificacio;
		return this;
	}

	public Integer getNumeroConsultes() {
		return numeroConsultes;
	}

	public Ruta setNumeroConsultes(Integer numeroConsultes) {
		this.numeroConsultes = numeroConsultes;
		return this;
	}

	@Override
	public String toString() {
		return "Cim [id_Ruta=" + id_Ruta + ", nom=" + nom + ", descripcio=" + descripcio + ", link=" + link + ", actiu="
				+ actiu + ", dataCreacio=" + dataCreacio + ", dataModificacio=" + dataModificacio + ", numeroConsultes="
				+ numeroConsultes + "]";
	}

}
