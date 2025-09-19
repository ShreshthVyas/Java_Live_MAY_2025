package Lecture44;

public class HashmapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String, Integer> map = new Hashmap<>();
		map.put("A", 10);
		map.put("B", 100);
		map.put("C", 1000);
		map.put("E", 10000);
		map.put("F", 10000);
		
		map.put("A", 1);
		System.out.println(map);
		map.remove("S");
		System.out.println(map);
	}

}
