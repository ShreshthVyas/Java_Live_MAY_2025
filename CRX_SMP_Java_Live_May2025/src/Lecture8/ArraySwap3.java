package Lecture8;

public class ArraySwap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int brr[] = {60, 70,80,90,100};
		System.out.println(arr[0] + " " + brr[0]);
		swap(arr,brr);
		System.out.println(arr[0] + " " + brr[0]);
	}

	public static void swap(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int t[] = arr;
		arr = brr;
		brr = t;
	}

}
