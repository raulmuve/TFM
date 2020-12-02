package com.tfm.springboot.api.rest.model;

import java.util.List;

public class RutesSearchOutput {

	private List<RutesSearchOutputRuta> rutes = null;

	public List<RutesSearchOutputRuta> getRutes() {
		return rutes;
	}

	public RutesSearchOutput setRutes(List<RutesSearchOutputRuta> rutes) {
		this.rutes = rutes;
		return this;
	}
	
	
}
