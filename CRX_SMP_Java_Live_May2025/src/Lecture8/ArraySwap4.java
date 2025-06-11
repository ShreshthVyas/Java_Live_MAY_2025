package Lecture8;

public class ArraySwap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {10,20,30,50,40};

		System.out.println(arr[1] + " " + arr[3]);
		swap(arr,1,3);
		System.out.println(arr[1] + " " + arr[3]);
	}

	public static void swap(int brr[], int a, int b) {
		int t = brr[a];
		brr[a]= brr[b] ;
		brr[b]= t;
	}

}
