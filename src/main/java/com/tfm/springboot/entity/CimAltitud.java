package com.tfm.springboot.entity;

import java.util.Date;

public class CimAltitud {

	private double cota;
	private String x;
	private String y;
	private Date data;
	
	private CimAltitud() {}

	public double getCota() {
		return cota;
	}

	public CimAltitud setCota(double cota) {
		this.cota = cota;
		return this;
	}

	public String getX() {
		return x;
	}

	public CimAltitud setX(String x) {
		this.x = x;
		return this;
	}

	public String getY() {
		return y;
	}

	public CimAltitud setY(String y) {
		this.y = y;
		return this;
	}

	public Date getData() {
		return data;
	}

	public CimAltitud setData(Date data) {
		this.data = data;
		return this;
	}

	@Override
	public String toString() {
		return "CimAltitud [cota=" + cota + ", x=" + x + ", y=" + y + ", data=" + data + "]";
	}

}
