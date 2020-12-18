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

import com.tfm.springboot.api.rest.model.RefugiPostInput;
import com.tfm.springboot.api.rest.model.RefugiPostOutput;

import com.tfm.springboot.api.service.RefugiService;
import com.tfm.springboot.api.rest.model.Refugi;
import com.tfm.springboot.api.rest.model.RefugiGetRefugis;

@RestController
@RequestMapping("/refugi")
public class RefugiController {

	@Autowired
	private RefugiService refugiService;

	@PostMapping
	ResponseEntity<RefugiPostOutput> add(@Valid @RequestBody RefugiPostInput refugiInput) {
		return refugiService.add(refugiInput);
	}

	@PostMapping("/modify")
	ResponseEntity<RefugiPostOutput> modify(@Valid @RequestBody RefugiPostInput refugiInput) {
		return refugiService.modify(refugiInput);
	}

	@GetMapping("/{id}")
	ResponseEntity<Refugi> search(@PathVariable() String id) {
		return refugiService.search(id);
	}

	@GetMapping("/top10")
	ResponseEntity<RefugiGetRefugis> top10() {
		return refugiService.top10();
	}

	@GetMapping("/allrefugis")
	ResponseEntity<RefugiGetRefugis> allRefugis() {
		return refugiService.all();
	}

	@PostMapping("delete/{id}")
	ResponseEntity<RefugiPostOutput> delete(@PathVariable String id) {
		return refugiService.delete(id);
	}
	
	@GetMapping("/bycim/{id}")
	ResponseEntity<RefugiGetRefugis> byCim(@PathVariable() String id) {
		return refugiService.byCim(id);
	}
}