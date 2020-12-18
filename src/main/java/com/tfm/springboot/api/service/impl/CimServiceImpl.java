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
import com.tfm.springboot.api.service.CimService;

@Service
public class CimServiceImpl implements CimService{
	
	static final String uri = "http://localhost:5004/cims/";

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
	public ResponseEntity<CimGetCims> top10() {
		ResponseEntity<CimGetCims> cims = template.getForEntity(uri + "top10", CimGetCims.class);
		
		return cims;
	}
	
	@Override
	public ResponseEntity<CimGetCims> searchAll() {
		ResponseEntity<CimGetCims> cims = template.getForEntity(uri, CimGetCims.class);
		
		return cims;
		
	}

}
