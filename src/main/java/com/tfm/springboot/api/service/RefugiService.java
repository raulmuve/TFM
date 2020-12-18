package com.tfm.springboot.api.service;

import org.springframework.http.ResponseEntity;

import com.tfm.springboot.api.rest.model.Refugi;
import com.tfm.springboot.api.rest.model.RefugiGetRefugis;
import com.tfm.springboot.api.rest.model.RefugiPostInput;
import com.tfm.springboot.api.rest.model.RefugiPostOutput;

public interface RefugiService {

	ResponseEntity<RefugiPostOutput> add(RefugiPostInput refugiInput);

	ResponseEntity<RefugiPostOutput> modify(RefugiPostInput refugiInpunt);

	ResponseEntity<Refugi> search(String id);

	ResponseEntity<RefugiGetRefugis> top10();

	ResponseEntity<RefugiGetRefugis> all();

	ResponseEntity<RefugiPostOutput> delete(String id);
	
	ResponseEntity<RefugiGetRefugis> byCim(String id);
}
