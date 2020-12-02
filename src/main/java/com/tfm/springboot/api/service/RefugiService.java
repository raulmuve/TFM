package com.tfm.springboot.api.service;

import com.tfm.springboot.api.rest.model.RefugiPostInput;
import com.tfm.springboot.api.rest.model.RefugiPostOutput;

public interface RefugiService {

	RefugiPostOutput add(RefugiPostInput refugiInput);
	
	RefugiPostOutput modify(RefugiPostInput refugiInpunt);
	
}
