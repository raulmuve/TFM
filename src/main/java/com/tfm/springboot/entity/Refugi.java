package com.tfm.springboot.entity;

import java.util.Date;
import java.util.List;

public class Refugi {

	private Integer idRefugi;
	private String Nom;
	private RefugiUbicacio ubicacio;
	private Integer places;
	private List<Integer> cims;
	private List<Integer> rutes;
	private Date dataCreacio;
	private Date dataModificacio;
	private Integer numConsultes;
	private boolean actiu;
	
	public Refugi() {
	}

	public Integer getIdRefugi() {
		return idRefugi;
	}

	public Refugi setIdRefugi(Integer idRefugi) {
		this.idRefugi = idRefugi;
		return this;
	}

	public String getNom() {
		return Nom;
	}

	public Refugi setNom(String nom) {
		Nom = nom;  
		return this;
	}

	public RefugiUbicacio getUbicacio() {
		return ubicacio;
	}

	public Refugi setUbicacio(RefugiUbicacio ubicacio) {
		this.ubicacio = ubicacio;
		return this;
	}

	public Integer getPlaces() {
		return places;
	}

	public Refugi setPlaces(Integer places) {
		this.places = places;
		return this;
	}

	public List<Integer> getCims() {
		return cims;
	}

	public Refugi setCims(List<Integer> cims) {
		this.cims = cims;
		return this;
	}

	public List<Integer> getRutes() {
		return rutes;
	}

	public Refugi setRutes(List<Integer> rutes) {
		this.rutes = rutes;
		return this;
	}

	public Date getDataCreacio() {
		return dataCreacio;
	}

	public Refugi setDataCreacio(Date dataCreacio) {
		this.dataCreacio = dataCreacio;
		return this;
	}

	public Date getDataModificacio() {
		return dataModificacio;
	}

	public Refugi setDataModificacio(Date dataModificacio) {
		this.dataModificacio = dataModificacio;
		return this;
	}

	public Integer getNumConsultes() {
		return numConsultes;
	}

	public Refugi setNumConsultes(Integer numConsultes) {
		this.numConsultes = numConsultes;
		return this;
	}

	
	public boolean isActiu() {
		return actiu;
	}

	public Refugi setActiu(boolean actiu) {
		this.actiu = actiu;
		return this;
	}

	@Override
	public String toString() {
		return "Refugi [idRefugi=" + idRefugi + ", Nom=" + Nom + ", ubicacio=" + ubicacio + ", places=" + places
				+ ", cims=" + cims + ", rutes=" + rutes + ", dataCreacio=" + dataCreacio + ", dataModificacio="
				+ dataModificacio + ", numConsultes=" + numConsultes + ", actiu=" + actiu + "]";
	}
}

