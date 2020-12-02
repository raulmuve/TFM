package com.tfm.springboot.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfm.springboot.api.service.RutaService;

@RestController
@RequestMapping("/ruta")
public class RutaController {

	@Autowired
	private RutaService rutaService;
	
}
