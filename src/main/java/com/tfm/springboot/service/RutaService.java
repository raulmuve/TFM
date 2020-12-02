package com.tfm.springboot.service;

import com.tfm.springboot.entity.Ruta;
import com.tfm.springboot.rest.model.RutaPostOutput;
import com.tfm.springboot.rest.model.RutesSearchOutputRuta;

public interface RutaService {

	RutaPostOutput AddRuta(Ruta ruta);

	RutaPostOutput ModifyRuta(Ruta ruta);

	RutesSearchOutputRuta searchByCim(int idCim);

	RutesSearchOutputRuta searchByRefugi(int idRefugi);

	RutesSearchOutputRuta topTen();
}
