package Lecture43;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String,Integer> map = new HashMap<>();
//		//O(1)
//		map.put("A", 10);
//		map.put("B", 20);
//		map.put("C", 30);
//		map.put("D", 40);
////		map.put("A", 100);
////		map.put("C", 200);
////		map.put(null, 100);
//		map.put(null, 400);
//		map.put("D", 500);
//		map.put("null", 100);
//		
//		System.out.println(map);
//		
//		//O(1)
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("G"));
//		
//		//O(1)
//		System.out.println(map.get("A"));
//		System.out.println(map.get("G"));
//		
//		//O(1)
//		map.remove("A");
//		System.out.println(map);
//		
//		System.out.println(map.getOrDefault("G", 0));
//		System.out.println(map.getOrDefault("B", 0));
//		
//		for (String key : map.keySet()) {
//			System.out.println(key + "=>" + map.get(key));
//		}
		
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
////		//O(1)
//		map.put("A", 10);
//		map.put("B", 20);
//		map.put("C", 30);
//		map.put("D", 40);
////		map.put("A", 100);
////		map.put("C", 200);
////		map.put(null, 100);
//		map.put(null, 400);
//		map.put("D", 500);
//		map.put("null", 100);
////		
//		System.out.println(map);
////		
////		//O(1)
////		System.out.println(map.containsKey("A"));
////		System.out.println(map.containsKey("G"));
////		
////		//O(1)
////		System.out.println(map.get("A"));
////		System.out.println(map.get("G"));
////		
////		//O(1)
////		map.remove("A");
////		System.out.println(map);
////		
////		System.out.println(map.getOrDefault("G", 0));
////		System.out.println(map.getOrDefault("B", 0));
////		
//		for (String key : map.keySet()) {
//			System.out.println(key + "=>" + map.get(key));
//		}
		
		TreeMap<String,Integer> map =  new TreeMap<>();
		//sTreeMap<String,Integer> map =  new TreeMap<>(Comparator.reverseOrder());
//		//O(1)
		map.put("C", 30);
		map.put("A", 10);
		map.put("D", 40);
		map.put("B", 20);
//		map.put("D", 500);
//		map.put("null", 100);
//		
		System.out.println(map);
//		
//		//O(1)
//		System.out.println(map.containsKey("A"));
//		System.out.println(map.containsKey("G"));
//		
//		//O(1)
//		System.out.println(map.get("A"));
//		System.out.println(map.get("G"));
//		
//		//O(1)
//		map.remove("A");
//		System.out.println(map);
//		
//		System.out.println(map.getOrDefault("G", 0));
//		System.out.println(map.getOrDefault("B", 0));
//		
		for (String key : map.keySet()) {
			System.out.println(key + "=>" + map.get(key));
		}
	}

}
