package com.va.cxf.rest;

import javax.ws.rs.core.Response;

import com.va.cxf.rest.calc.Calculator;
import com.va.cxf.rest.model.Addition;

public class AdditionServiceImpl implements AdditionService{

	Addition addition;
	Calculator calculator;

	public void setAddition(Addition addition) {
		this.addition = addition;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public Response add(int valueOne, int valueTwo) {
		
		addition.setValueOne(valueOne);
		addition.setValueTwo(valueTwo);
		calculator.add(addition);
		return Response.ok(addition).build();
		 
	}

}
