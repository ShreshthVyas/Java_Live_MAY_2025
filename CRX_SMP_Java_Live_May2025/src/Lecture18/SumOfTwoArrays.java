package Lecture18;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9,9,8};
		int brr[] = {1,0,9};
		ArrayList<Integer> list = new ArrayList<>();
		int i = arr.length-1;
		int j = brr.length-1;
		int carry = 0;
		
		while(i>=0 && j>=0) {
			int q = (arr[i]+brr[j] + carry) % 10;
			list.addFirst(q);
			carry = (arr[i]+brr[j] + carry ) /10;
			i--;
			j--;
		}
		
		while(i>=0) {
			int q = (arr[i]+ carry) % 10;
			list.addFirst(q);
			carry = (arr[i]+carry) /10;
			i--;
		
		}
		while(j>=0) {
			int q = (brr[j] + carry) % 10;
			list.addFirst(q);
			carry = (brr[j] + carry) /10;
			j--;
		}
		
		if(carry>0) {
			list.addFirst(carry);
		}
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
	}

}
