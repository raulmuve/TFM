package com.tfm.springboot.api.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tfm.springboot.api.rest.model.Greeting;
import com.tfm.springboot.api.rest.model.RutesSearchOutputRuta;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/ruta")
	public RutesSearchOutputRuta search()
	{
		RutesSearchOutputRuta ruta = new RutesSearchOutputRuta()
				.setNom("TFM - Sistemes distribuits. 2020")
				.setId_ruta(1);
				
		return ruta;
	}
	
}
