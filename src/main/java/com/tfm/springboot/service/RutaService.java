package com.tfm.springboot.service;

import com.tfm.springboot.rest.model.RutaPostInput;
import com.tfm.springboot.rest.model.RutaPostOutput;
import com.tfm.springboot.rest.model.RutesSearchOutputRuta;

public interface RutaService {

	RutaPostOutput AddRuta(RutaPostInput ruta);

	RutaPostOutput ModifyRuta(RutaPostInput ruta);

	RutesSearchOutputRuta searchByCim(int idCim);

	RutesSearchOutputRuta searchByRefugi(int idRefugi);

	RutesSearchOutputRuta topTen();
}
