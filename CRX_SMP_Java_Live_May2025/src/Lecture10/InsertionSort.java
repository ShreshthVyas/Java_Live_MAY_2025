package Lecture10;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,-1,2,3,12,-2};
		
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j];//shift
				j--;
			}
			j++;
			arr[j] = item;
		}
		
	}

}
