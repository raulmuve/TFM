package com.tfm.springboot.api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tfm.springboot.api.rest.model.RutaPostInput;
import com.tfm.springboot.api.rest.model.RutaPostOutput;
import com.tfm.springboot.api.rest.model.RutesSearchOutput;

@Service
public interface RutaService {

	ResponseEntity<RutaPostOutput> addRuta(RutaPostInput ruta);

	ResponseEntity<RutaPostOutput> modifyRuta(RutaPostInput ruta, String id);

	ResponseEntity<RutesSearchOutput> searchByCim(String idCim);

	ResponseEntity<RutesSearchOutput> searchByRefugi(String idRefugi);

	ResponseEntity<RutesSearchOutput> topTen();

	ResponseEntity<RutesSearchOutput> search(String id);
}
