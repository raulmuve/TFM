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

import com.tfm.springboot.api.rest.model.RutaPostInput;
import com.tfm.springboot.api.rest.model.RutaPostOutput;
import com.tfm.springboot.api.rest.model.RutesSearchOutput;
import com.tfm.springboot.api.service.RutaService;

@RestController
@RequestMapping("/ruta")
public class RutaController {

	@Autowired
	private RutaService rutaService;

	@GetMapping("/{id}")
	ResponseEntity<RutesSearchOutput> search(@PathVariable() String id) {
		return rutaService.search(id);
	}

	@PostMapping("")
	ResponseEntity<RutaPostOutput> add(@Valid @RequestBody RutaPostInput rutaInput) {
		return rutaService.addRuta(rutaInput);
	}

	@PostMapping("/{id}")
	ResponseEntity<RutaPostOutput> modify(@PathVariable() String id, @Valid @RequestBody RutaPostInput rutaInput) {
		return rutaService.modifyRuta(rutaInput, id);
	}

	@GetMapping("/top10")
	ResponseEntity<RutesSearchOutput> top10() {
		return rutaService.topTen();

	}
}
