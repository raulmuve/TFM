package com.tfm.springboot.api.service.impl;

import org.springframework.stereotype.Service;

import com.tfm.springboot.api.rest.model.RefugiPostInput;
import com.tfm.springboot.api.rest.model.RefugiPostOutput;
import com.tfm.springboot.api.service.RefugiService;

@Service
public class RefugiServiceImpl implements RefugiService {
	
	@Override
	public RefugiPostOutput add(RefugiPostInput refugiInput) {
		RefugiPostOutput mockup = new RefugiPostOutput()
				.setId_Refugi(5)
				.setNom("Respuesta Correcta");
				
		return mockup;
	}

	@Override
	public RefugiPostOutput modify(RefugiPostInput refugiInpunt) {
		// TODO Auto-generated method stub
		return null;
	}


}
