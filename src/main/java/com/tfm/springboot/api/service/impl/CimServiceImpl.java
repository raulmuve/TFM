package com.tfm.springboot.api.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tfm.springboot.api.rest.model.Cim;
import com.tfm.springboot.api.rest.model.CimGetCims;
import com.tfm.springboot.api.rest.model.CimPostInput;
import com.tfm.springboot.api.rest.model.CimPostOutput;
import com.tfm.springboot.api.rest.model.RefugiPostInput;
import com.tfm.springboot.api.rest.model.RefugiPostOutput;
import com.tfm.springboot.api.rest.model.RutesSearchOutput;
import com.tfm.springboot.api.service.CimService;

@Service
public class CimServiceImpl implements CimService{
	
	static final String uri = "http://serviceCim:80/cims/";

	RestTemplate template = new RestTemplate();

	@Override
	public ResponseEntity<CimPostOutput> add(CimPostInput cimInput) {
		ResponseEntity<CimPostOutput> cim = template.postForEntity(uri, cimInput, CimPostOutput.class);

		return cim;
	}
	
	@Override
	public ResponseEntity<CimPostOutput> modify(CimPostInput cimInput) {
		ResponseEntity<CimPostOutput> cim = template.postForEntity(uri + "modify", cimInput, CimPostOutput.class);
		return cim;
	}

	@Override
	public ResponseEntity<CimPostOutput> delete(CimPostInput cimInput) {
		ResponseEntity<CimPostOutput> cim = template.postForEntity(uri + "delete", cimInput, CimPostOutput.class);
		return cim;
	}
	
	@Override
	public ResponseEntity<Cim> search(String id){
		ResponseEntity<Cim> cim = template.getForEntity(uri + id, Cim.class);
		
		return cim;
	}
	
	@Override
	public ResponseEntity<Object> top10() {
		ResponseEntity<Object> cims = template.getForEntity(uri + "top10", Object.class);
		
		return cims;
	}
	
	@Override
	public ResponseEntity<Object> searchAll() {
		ResponseEntity<Object> cims = template.getForEntity(uri, Object.class);
		
		return cims;
		
	}

}
