package Lecture10;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5,4,3,2,1};
		
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i < arr.length-pass; i++) {
				if(arr[i]>arr[i+1]) {
					int t = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = t;
				}
			}
		}
		
	}

}
