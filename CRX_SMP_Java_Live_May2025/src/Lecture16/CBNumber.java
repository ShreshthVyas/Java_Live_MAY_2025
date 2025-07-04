package Lecture16;

import java.util.Iterator;
import java.util.Scanner;

public class CBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
		String s = sc.next();
		int count = 0;
		boolean arr[] = new boolean[s.length()];
		for (int i = 1; i <=s.length(); i++) {// length of substring
			for (int j = 0; j <= s.length()-i; j++) {//starting points
				String str = s.substring(j,j+i);
				long l = Long.parseLong(str);
				
				if(isCB(l) && repeat(arr,j,j+i)) {
					System.out.println(l);
					count++;
					for (int k = j; k < j+i; k++) {// index mark true , cannot be used again
						arr[k] = true;
					}
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean repeat(boolean[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		for (int k = i; k<j; k++) {
			if(arr[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCB(long n) {
		if(n == 0 || n == 1) {//point 1
			return false;
		}
		long arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		
		for (int i = 0; i < arr.length; i++) { //point 2
			if(arr[i] == n) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) { //point 3
			if(n%arr[i] == 0) {
				return false;
			}
		}
		return true;
		
	}

}
