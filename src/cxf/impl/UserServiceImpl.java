package cxf.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cxf.UserService;
import cxf.vo.Cat;
import cxf.vo.User;

public class UserServiceImpl implements UserService {
	
	static Map<User,List<Cat>> catDb = new HashMap<User,List<Cat>>();
	
	static{
		List<Cat> l1 = new ArrayList<Cat>();
		l1.add(new Cat("blue","1","cat1"));
		l1.add(new Cat("white","2","cat2"));
		catDb.put(new User(1,"han","password","address"), l1);
		
	}
	
	@Override
	public List<Cat> getCatByUser(User user) {
		// TODO Auto-generated method stub
		return catDb.get(user);
	}

}
