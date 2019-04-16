package org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = System.getProperties();
		Set s = p.entrySet();
		HashMap<String,String> map = (HashMap) p.entrySet();
		
		System.out.println("Set : " + s);
		System.out.println("**************************");
		
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " <---> " + entry.getValue());
		}
		
		System.out.println("**************************");
		
		for(Map.Entry s1:p.entrySet()){
			//System.out.println(s1.getKey() + s1.getValue());
			
		}
	}

}
