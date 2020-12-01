package com.tfm.springboot.api.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tfm.springboot.entity.Ruta;
import com.tfm.springboot.rest.model.Greeting;
import com.tfm.springboot.rest.model.RutaSearchOutput;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/ruta")
	public RutaSearchOutput search()
	{
		RutaSearchOutput ruta = new RutaSearchOutput()
				.setNom("TFM - Sistemes distribuits. 2020")
				.setId_ruta(1);
				
		return ruta;
	}
	
}
