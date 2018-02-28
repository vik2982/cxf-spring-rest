package com.va.cxf.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Addition {

	private int valueOne;
	private int valueTwo;
	private int result;
	
	public int getValueOne() {
		return valueOne;
	}
	public void setValueOne(int valueOne) {
		this.valueOne = valueOne;
	}
	public int getValueTwo() {
		return valueTwo;
	}
	public void setValueTwo(int valueTwo) {
		this.valueTwo = valueTwo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
}