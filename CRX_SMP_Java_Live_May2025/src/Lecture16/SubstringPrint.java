package Lecture16;

import java.util.Iterator;
import java.util.Scanner;

public class SubstringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		System.out.println(s.substring(2));
		substring_print(s);
		
	}

	public static void substring_print(String s) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < s.length(); i++) {// starting points
			for (int j = i; j < s.length(); j++) {//ending point
//				String str = "";
//				for (int k = i; k <=j; k++) {
//					str = str+ s.charAt(k);
//				}
//				System.out.println(str);
				System.out.println(s.substring(i,j+1));
			}
			
		}
		
	}

}
