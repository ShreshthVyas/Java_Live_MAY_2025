package Lecture26;

import java.util.ArrayList;
import java.util.List;

public class PalinDromePartitionLeetcode {
	
	public static void main(String[] args) {
		
	}
	
	List<List<String>> ans = new ArrayList<>();
	public List<List<String>> partition(String s) {
		List<String> list = new ArrayList<>();
		part(s,list);
		return ans;
    }
	public  void part(String ques, List<String> list) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			List<String> temp = new ArrayList<>(list);
			ans.add(temp);
			return;
		}
		
		for (int i = 1; i <= ques.length(); i++) {
			String temp = ques.substring(0,i);
			if(isPal(temp)) {
				list.add(temp);
				part(ques.substring(i), list);
				list.remove(list.size()-1);//backtrack
			}
		}
		
	}
	public  boolean isPal(String s) {
		// TODO Auto-generated method stub
		int i =0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
