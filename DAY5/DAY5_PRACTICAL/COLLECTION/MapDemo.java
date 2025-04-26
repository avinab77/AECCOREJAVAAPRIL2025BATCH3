package COLLECTION;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<String,Double> hp=new HashMap<String, Double>();
//LinkedHashMap<String,Double> hp=new LinkedHashMap<String, Double>();
TreeMap<String,Double> hp=new TreeMap<String, Double>();
hp.put("TV",25000.00);
hp.put("REFRIGERATOR",27000.00);
hp.put("CONVECTION",27000.00);
hp.put("MOBILE",12000.00);
hp.put("LAPTOP",45000.00);
hp.put("TV",32000.00);
System.out.println(hp);

	}

}
