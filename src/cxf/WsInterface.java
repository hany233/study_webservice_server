package cxf;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cxf.util.CatXmlAdapter;
import cxf.vo.Cat;
import cxf.vo.User;

@WebService
public interface WsInterface {
	public String hello(String name);

	public List<Cat> getCatByUser(User user);

	public @XmlJavaTypeAdapter(CatXmlAdapter.class) Map<String,Cat> getAllCats();
	
}
