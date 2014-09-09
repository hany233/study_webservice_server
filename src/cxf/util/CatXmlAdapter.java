package cxf.util;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import cxf.util.StringCat.Entry;
import cxf.vo.Cat;

public class CatXmlAdapter extends XmlAdapter<StringCat,Map<String,Cat>>{

	@Override
	public StringCat marshal(Map<String, Cat> v) throws Exception {
		StringCat sc = new StringCat();
		for(String key:v.keySet()){
			sc.getEntries().add(new Entry(key,v.get(key)));
		}
		return null;
	}

	@Override
	public Map<String, Cat> unmarshal(StringCat v) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Cat> m = new HashMap<String,Cat>();
		for(Entry entry:v.getEntries()){
			m.put(entry.getKey(),entry.getValue());
		}
		return m;
	}



}
