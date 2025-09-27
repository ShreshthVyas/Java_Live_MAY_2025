package Lecture45;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] arr) {
		HashMap<String,List<String>> map = new HashMap<>();
		List<List<String>> ans =  new ArrayList<>();
		for (String s : arr) {
			char[] ch =  s.toCharArray();
			Arrays.sort(ch);
			String temp  =  new String(ch);
			
			if(map.containsKey(temp)) {
				List<String>  list= map.get(temp) ;
				list.add(s);
			}
			else {
				List<String> list = new ArrayList<>();
				map.put(temp, list);
				map.get(temp).add(s);
			}	
		}
		
		for (String s: map.keySet()) {
			ans.add(map.get(s));
		}
		
		return ans;
	}

}
