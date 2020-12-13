package com.tfm.springboot.api.rest.model;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class RefugiPostOutput {


		@JsonProperty("id")
		@JsonPropertyDescription("refugi code")
		@NotEmpty(message = "id is mandatory")
		private String id;

		@JsonProperty("nom")
		@JsonPropertyDescription("nom code")
		@NotEmpty(message = "nom is mandatory")
		private String nom;
		
		@JsonProperty("places")
		@JsonPropertyDescription("places code")
		@NotEmpty(message = "places is mandatory")
		private Integer places;

		@JsonProperty("id")
		public String getId() {
			return id;
		}

		@JsonProperty("id")
		public RefugiPostOutput setId(String id) {
			this.id = id;
			return this;
		}

		@JsonProperty("nom")
		public String getNom() {
			return nom;
		}

		@JsonProperty("nom")
		public RefugiPostOutput setNom(String nom) {
			this.nom = nom;
			return this;
		}
	
}
