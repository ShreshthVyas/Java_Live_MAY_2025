package Lecture12;

import java.util.Arrays;

public class InbuiltsSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,200,-14,9,-1};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
