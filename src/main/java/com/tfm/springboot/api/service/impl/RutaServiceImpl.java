package com.tfm.springboot.api.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tfm.springboot.api.rest.model.RutaPostInput;
import com.tfm.springboot.api.rest.model.RutaPostOutput;
import com.tfm.springboot.api.rest.model.RutesSearchOutput;
import com.tfm.springboot.api.service.RutaService;

@Service
public class RutaServiceImpl implements RutaService {

	static final String uri = "http://localhost:5000/rutes/";

	RestTemplate template = new RestTemplate();

	public ResponseEntity<RutaPostOutput> addRuta(RutaPostInput rutaInput) {

		ResponseEntity<RutaPostOutput> ruta = template.getForEntity(uri, RutaPostOutput.class);

		return ruta;
	}

	public ResponseEntity<RutaPostOutput> modifyRuta(RutaPostInput rutaInput) {
		ResponseEntity<RutaPostOutput> ruta = template.getForEntity(uri + "modify" , RutaPostOutput.class);

		return ruta;

	}

	public ResponseEntity<RutesSearchOutput> searchByCim(String idCim) {

		ResponseEntity<RutesSearchOutput> ruta = template.getForEntity(uri + "/getByIdCim/" + idCim,
				RutesSearchOutput.class);

		return ruta;
	}

	public ResponseEntity<RutesSearchOutput> searchByRefugi(String idRefugi) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<RutesSearchOutput> topTen() {

		ResponseEntity<RutesSearchOutput> ruta = template.getForEntity(uri + "top10", RutesSearchOutput.class);

		return ruta;
	}

	@Override
	public ResponseEntity<RutesSearchOutput> search(String id) {

		ResponseEntity<RutesSearchOutput> ruta = template.getForEntity(uri + id, RutesSearchOutput.class);

		return ruta;
	}

	@Override
	public ResponseEntity<RutaPostOutput> delete(String id) {
		ResponseEntity<RutaPostOutput> ruta = template.getForEntity(uri + "delete/"+ id , RutaPostOutput.class);

		return ruta;
	}

	@Override
	public ResponseEntity<RutesSearchOutput> searchAll() {
		ResponseEntity<RutesSearchOutput> ruta = template.getForEntity(uri , RutesSearchOutput.class);

		return ruta;
	}

}
