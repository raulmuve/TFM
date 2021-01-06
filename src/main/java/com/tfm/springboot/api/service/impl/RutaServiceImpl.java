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

	static final String uri = "http://serviceRuta:80/rutes/";

	RestTemplate template = new RestTemplate();

	public ResponseEntity<Object> addRuta(RutaPostInput rutaInput) {

		ResponseEntity<Object> ruta = template.postForEntity(uri, rutaInput, Object.class);

		return ruta;
	}

	public ResponseEntity<RutaPostOutput> modifyRuta(RutaPostInput rutaInput) {
		ResponseEntity<RutaPostOutput> ruta = template.postForEntity(uri + "modify" , rutaInput, RutaPostOutput.class);

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

	public ResponseEntity<Object> topTen() {

		ResponseEntity<Object> ruta = template.getForEntity(uri + "top10", Object.class);

		return ruta;
	}

	@Override
	public ResponseEntity<Object> search(String id) {

		ResponseEntity<Object> ruta = template.getForEntity(uri + id, Object.class);

		return ruta;
	}

	@Override
	public ResponseEntity<RutaPostOutput> delete(String id) {
		ResponseEntity<RutaPostOutput> ruta = template.postForEntity(uri + "delete/"+ id , null, RutaPostOutput.class);

		return ruta;
	}

	@Override
	public ResponseEntity<Object> searchAll() {
		ResponseEntity<Object> ruta = template.getForEntity(uri , Object.class);

		return ruta;
	}

}
