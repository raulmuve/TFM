package com.tfm.springboot.api.rest.model;

import java.util.List;

public class RefugisSearchOutput {
	private List<RefugiPostOutput> refugis = null;

	public List<RefugiPostOutput> getRutes() {
		return refugis;
	}

	public RefugisSearchOutput setRutes(List<RefugiPostOutput> rutes) {
		this.refugis = rutes;
		return this;
	}

}
