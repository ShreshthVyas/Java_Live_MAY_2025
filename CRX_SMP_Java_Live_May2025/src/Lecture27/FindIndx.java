package Lecture27;

import java.util.Arrays;

public class FindIndx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,3,-1,7,-2,6,2,5,4};
		
		int pivot = partition(arr,0,arr.length-1);
		System.out.println(pivot);
		System.out.println(Arrays.toString(arr));
		
	}

	public static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int idx = si;
		
		for (int i = si; i < ei; i++) {
			if(arr[i]<item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;
	}

}
