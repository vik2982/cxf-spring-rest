package com.va.cxf.rest.business;

import com.va.cxf.rest.model.Addition;

public class CalculatorImpl implements Calculator{

	public void add(Addition addition) {
		addition.setResult(addition.getValueOne() + addition.getValueTwo());
	}

}
