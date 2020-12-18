package com.tfm.springboot.api.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tfm.springboot.api.rest.model.Cim;
import com.tfm.springboot.api.rest.model.CimGetCims;
import com.tfm.springboot.api.rest.model.CimPostInput;
import com.tfm.springboot.api.rest.model.CimPostOutput;


@Service
public interface CimService {
	
	ResponseEntity<CimPostOutput> add(CimPostInput cim);

	ResponseEntity<CimPostOutput> modify(CimPostInput cim);

	ResponseEntity<CimPostOutput> delete(CimPostInput cim);
	
	ResponseEntity<Cim> search(String id);
	
	ResponseEntity<CimGetCims> top10();
	
	ResponseEntity<CimGetCims> searchAll();
}
