package cxf.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import cxf.HelloWord;
import cxf.UserService;
import cxf.WsInterface;
import cxf.vo.Cat;
import cxf.vo.User;

@WebService(endpointInterface="cxf.WsInterface",serviceName="testws")
public class WsImpl implements WsInterface {

	@Override
	public List<Cat> getCatByUser(User user) {
		// TODO Auto-generated method stub
		UserService us = new UserServiceImpl();
		return us.getCatByUser(user);
	}

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		HelloWord hw = new HelloWordImpl();
		return hw.hello(name);
	}

	@Override
	public Map<String, Cat> getAllCats() {
		// TODO Auto-generated method stub
		Map<String, Cat> m = new HashMap<String,Cat>();
		m.put("1", new Cat("1","cat1","2"));
		return m;
	}

}
