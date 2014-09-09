package cxf.impl;

import cxf.HelloWord;


public class HelloWordImpl implements HelloWord {

	@Override
	public String hello(String name) {
		return "hello "+name;
	}

	
}
