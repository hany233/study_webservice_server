package cxf;

import java.util.List;

import cxf.vo.Cat;
import cxf.vo.User;

public interface UserService {
	List<Cat> getCatByUser(User user);
}
