package com.tfm.springboot.api.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class RefugiGetRefugis {

	@JsonProperty("refugis")
	@JsonPropertyDescription("refugis code")
	private List<RefugiGetRefugisRefugi> refugis = null;

	@JsonProperty("refugis")
	public List<RefugiGetRefugisRefugi> getRefugis() {
		return refugis;
	}

	@JsonProperty("refugis")
	public void setRefugis(List<RefugiGetRefugisRefugi> refugis) {
		this.refugis = refugis;
	}

	@Override
	public String toString() {
		return "RefugiGetRefugis [refugis=" + refugis + "]";
	}
}
