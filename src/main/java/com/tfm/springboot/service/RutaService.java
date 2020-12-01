package com.tfm.springboot.service;

import com.tfm.springboot.entity.Ruta;
import com.tfm.springboot.rest.model.RutaSearchOutput;

public interface RutaService {

	RutaSearchOutput AddRuta(Ruta ruta);

	RutaSearchOutput ModifyRuta(Ruta ruta);

	RutaSearchOutput searchByCim(int idCim);

	RutaSearchOutput searchByRefugi(int idRefugi);

	RutaSearchOutput topTen();
}
