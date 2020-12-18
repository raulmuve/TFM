package com.tfm.springboot.api.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tfm.springboot.api.rest.model.Refugi;
import com.tfm.springboot.api.rest.model.RefugiGetRefugis;
import com.tfm.springboot.api.rest.model.RefugiPostInput;
import com.tfm.springboot.api.rest.model.RefugiPostOutput;
import com.tfm.springboot.api.service.RefugiService;

@Service
public class RefugiServiceImpl implements RefugiService {

	static final String uri = "http://localhost:8181/refugi/";

	RestTemplate template = new RestTemplate();

	@Override
	public ResponseEntity<RefugiPostOutput> add(RefugiPostInput refugiInput) {
		ResponseEntity<RefugiPostOutput> refugi = template.postForEntity(uri, refugiInput, RefugiPostOutput.class);

		return refugi;

	}

	@Override
	public ResponseEntity<RefugiPostOutput> modify(RefugiPostInput refugiInput) {
		ResponseEntity<RefugiPostOutput> refugi = template.postForEntity(uri + "modify", refugiInput,
				RefugiPostOutput.class);
		return refugi;
	}

	@Override
	public ResponseEntity<Refugi> search(String id) {
		ResponseEntity<Refugi> refugi = template.getForEntity(uri + id, Refugi.class);

		return refugi;
	}

	@Override
	public ResponseEntity<RefugiGetRefugis> top10() {
		ResponseEntity<RefugiGetRefugis> refugi = template.getForEntity(uri + "top10", RefugiGetRefugis.class);

		return refugi;
	}

	@Override
	public ResponseEntity<RefugiGetRefugis> all() {
		ResponseEntity<RefugiGetRefugis> refugi = template.getForEntity(uri + "allrefugis", RefugiGetRefugis.class);

		return refugi;
	}

	@Override
	public ResponseEntity<RefugiPostOutput> delete(String id) {
		ResponseEntity<RefugiPostOutput> refugi = template.postForEntity(uri + "delete/" + id, null,
				RefugiPostOutput.class);

		return refugi;

	}

	@Override
	public ResponseEntity<RefugiGetRefugis> byCim(String id) {
		ResponseEntity<RefugiGetRefugis> refugi = template.getForEntity(uri + "bycim/" + id, RefugiGetRefugis.class);

		return refugi;
	}

}
