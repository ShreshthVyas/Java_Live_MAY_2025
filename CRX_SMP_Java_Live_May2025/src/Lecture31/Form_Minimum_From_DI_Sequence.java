package Lecture31;

import java.util.Arrays;
import java.util.Stack;

public class Form_Minimum_From_DI_Sequence {
	//https://leetcode.com/problems/construct-smallest-number-from-di-string/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIDDDD";
		int ans[] = new int[s.length()+1];
		Stack<Integer> st =  new Stack<Integer>();
		int n =1;
		for (int i = 0; i <= s.length(); i++) {
			if(i == s.length() || s.charAt(i) == 'I') {
				ans[i] = n++;
				
				while(!st.isEmpty()) {
					ans[st.pop()] = n++;
				}
				
			}
			else {
				st.push(i);
			}
		}
		
		System.out.println(Arrays.toString(ans));
		
		
	}

}
