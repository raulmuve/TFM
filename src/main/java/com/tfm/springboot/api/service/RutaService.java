package com.tfm.springboot.api.service;

import org.springframework.stereotype.Service;

import com.tfm.springboot.api.rest.model.RutaPostInput;
import com.tfm.springboot.api.rest.model.RutaPostOutput;
import com.tfm.springboot.api.rest.model.RutesSearchOutputRuta;

@Service
public interface RutaService {

	RutaPostOutput addRuta(RutaPostInput ruta);

	RutaPostOutput modifyRuta(RutaPostInput ruta);

	RutesSearchOutputRuta searchByCim(int idCim);

	RutesSearchOutputRuta searchByRefugi(int idRefugi);

	RutesSearchOutputRuta topTen();
}
