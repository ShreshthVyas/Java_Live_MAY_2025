package Lecture8;

public class ArraySwap2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {10,20,30,50,40};

		System.out.println(arr[1] + " " + arr[3]);
		swap(arr, arr[1], arr[3]);
		System.out.println(arr[1] + " " + arr[3]);
	}

	public static void swap(int arr[], int a, int b) {
		int t = a;
		a = b;
		b= t;
		System.out.println(a + " " + b);
	}
}
