package com.tfm.springboot.api.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfm.springboot.api.rest.model.Cim;
import com.tfm.springboot.api.rest.model.CimGetCims;
import com.tfm.springboot.api.rest.model.CimPostInput;
import com.tfm.springboot.api.rest.model.CimPostOutput;
import com.tfm.springboot.api.service.CimService;

@RestController
@RequestMapping("/cim")
public class CimController {

	@Autowired
	private CimService cimService;
	
	@PostMapping("")
	ResponseEntity<CimPostOutput> search(@Valid @RequestBody CimPostInput cimPostInput) {
		return cimService.add(cimPostInput);
	}
	
	@PostMapping("/modify")
	ResponseEntity<CimPostOutput> modify(@Valid @RequestBody CimPostInput cimPostInput) {
		return cimService.modify(cimPostInput);
	}
	
	@PostMapping("/delete")
	ResponseEntity<CimPostOutput> delete(@Valid @RequestBody CimPostInput cimPostInput) {
		return cimService.delete(cimPostInput);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Cim> search(@PathVariable() String id) {
		return cimService.search(id);
	}
	
	@GetMapping("/top10")
	ResponseEntity<CimGetCims> topten() {
		return cimService.top10();
	}
	
	@GetMapping("")
	ResponseEntity<CimGetCims> searchAll() {
		return cimService.searchAll();
	}
	
}
