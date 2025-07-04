package Lecture16;

import java.util.Arrays;

public class FrequencyofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabaaabbcccddddeeexxy";
		
		int arr[] = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int idx = ch -'a';
			arr[idx]++; //arr[idx] = arr[idx]+1
		}
		
		for (int i = 0; i < arr.length; i++) {
			char ch = (char) (i+'a');
			System.out.println(ch + " -- "+ arr[i]);
		}
		
	}

}
