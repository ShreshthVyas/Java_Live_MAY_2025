package Lecture40;

import java.util.Arrays;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5};
		String arr1[] = {"a", "b" ,"c" , "d" ,"e"};
		Double brr[]=  {1.2,2.4,3.0,4.6,5.3};
		Display(arr1);
		Display(arr);
		Display(brr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr1));
	}

	private static <T>void Display(T[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
