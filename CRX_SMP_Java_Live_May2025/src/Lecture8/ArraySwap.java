package Lecture8;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {10,20,30,50,40};
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " , ");
//		}
		System.out.println(arr[1] + " " + arr[3]);
		swap(arr[1], arr[3]);
		System.out.println(arr[1] + " " + arr[3]);
		
	}
	
	public static void swap(int a , int b) {
		int t = a;
		a = b;
		b= t;
	}

}
