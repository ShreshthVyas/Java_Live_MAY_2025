package Lecture43;

import java.util.HashMap;

public class FrequencyInString {
	public static void main(String[] args) {
		String s = "aaabbbccffggaabbccgdbabrbfbwd";
		HashMap<Character,Integer> map =  new HashMap<>();
		
		for (char ch : s.toCharArray()) {
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}
//			else {
//				map.put(ch, 1);
//			}
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for (Character ch : map.keySet()) {
			System.out.println(ch + "=>" + map.get(ch));
		}
	}
}
