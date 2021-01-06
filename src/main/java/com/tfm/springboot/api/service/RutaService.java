package com.tfm.springboot.api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tfm.springboot.api.rest.model.RutaPostInput;
import com.tfm.springboot.api.rest.model.RutaPostOutput;
import com.tfm.springboot.api.rest.model.RutesSearchOutput;

@Service
public interface RutaService {

	ResponseEntity<Object> addRuta(RutaPostInput ruta);

	ResponseEntity<RutaPostOutput> modifyRuta(RutaPostInput ruta);

	ResponseEntity<RutesSearchOutput> searchByCim(String idCim);

	ResponseEntity<RutesSearchOutput> searchByRefugi(String idRefugi);

	ResponseEntity<Object> topTen();

	ResponseEntity<Object> search(String id);
	
	ResponseEntity<Object> searchAll();
	
	ResponseEntity<RutaPostOutput> delete(String id);
}
