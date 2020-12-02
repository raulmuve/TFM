package com.tfm.springboot.api.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tfm.springboot.api.rest.model.RefugiPostInput;
import com.tfm.springboot.api.rest.model.RefugiPostOutput;
import com.tfm.springboot.api.service.RefugiService;

@RestController
@RequestMapping("/refugi")
public class RefugiController {

	@Autowired
	private RefugiService refugiService;
	
	@PostMapping
	RefugiPostOutput add(@Valid @RequestBody RefugiPostInput refugiInput) {
		try {
			return refugiService.add(refugiInput);
		} catch(Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage(), ex);
		}
	}
}
