package com.tfm.springboot.api.entity;

import java.util.Date;

public class Cim {

	private Integer id_Cim;
	private String nom;
	private String descripcio;
	private CimInformacioGeneral informacioGeneral;
	private CimAltitud altitud;
	private boolean actiu;
	private Date dataCreacio;
	private Date dataModificacio;
	private Integer numeroRefugis;
	private Integer numeroRutes;
	private Integer numeroConsultes;

	public Cim() {
	}

	public Integer getId_Cim() {
		return id_Cim;
	}

	public Cim setId_Cim(Integer id_Cim) {
		this.id_Cim = id_Cim;
		return this;
	}

	public String getNom() {
		return nom;
	}

	public Cim setNom(String nom) {
		this.nom = nom;
		return this;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public Cim setDescripcio(String descripcio) {
		this.descripcio = descripcio;
		return this;
	}

	public CimInformacioGeneral getInformacioGeneral() {
		return informacioGeneral;
	}

	public Cim setInformacioGeneral(CimInformacioGeneral informacioGeneral) {
		this.informacioGeneral = informacioGeneral;
		return this;
	}

	public CimAltitud getAltitud() {
		return altitud;
	}

	public Cim setAltitud(CimAltitud altitud) {
		this.altitud = altitud;
		return this;
	}

	public boolean isActiu() {
		return actiu;
	}

	public Cim setActiu(boolean actiu) {
		this.actiu = actiu;
		return this;
	}

	public Date getDataCreacio() {
		return dataCreacio;
	}

	public Cim setDataCreacio(Date dataCreacio) {
		this.dataCreacio = dataCreacio;
		return this;
	}

	public Date getDataModificacio() {
		return dataModificacio;
	}

	public Cim setDataModificacio(Date dataModificacio) {
		this.dataModificacio = dataModificacio;
		return this;
	}

	public Integer getNumeroRefugis() {
		return numeroRefugis;
	}

	public Cim setNumeroRefugis(Integer numeroRefugis) {
		this.numeroRefugis = numeroRefugis;
		return this;
	}

	public Integer getNumeroRutes() {
		return numeroRutes;
	}

	public Cim setNumeroRutes(Integer numeroRutes) {
		this.numeroRutes = numeroRutes;
		return this;
	}

	public Integer getNumeroConsultes() {
		return numeroConsultes;
	}

	public Cim setNumeroConsultes(Integer numeroConsultes) {
		this.numeroConsultes = numeroConsultes;
		return this;
	}

	@Override
	public String toString() {
		return "Cim [id_Cim=" + id_Cim + ", nom=" + nom + ", descripcio=" + descripcio + ", informacioGeneral="
				+ informacioGeneral + ", altitud=" + altitud + ", actiu=" + actiu + ", dataCreacio=" + dataCreacio
				+ ", dataModificacio=" + dataModificacio + ", numeroRefugis=" + numeroRefugis + ", numeroRutes="
				+ numeroRutes + ", numeroConsultes=" + numeroConsultes + "]";
	}
}
