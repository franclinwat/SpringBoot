package com.wat.HelloWordSpring.Model;

public class Helloword {

	private String value="Hello word";
	
	public String getValue() {
		
		return value;
	}
	
	public void  setValue(String value) {
		
			this.value=value;
		}
	
	@Override
	public String toString() {
		return value;
	}
}
