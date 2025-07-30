package Lecture26;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,2,10,11,3,-2,14,19,4};
		int ans[] = mergesort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(ans));
		
	}

	public static int[] mergesort(int[] arr,int i, int j) {
		// TODO Auto-generated method stub
		if(i==j) {//single element
			int temp[] = new int[1];
			temp[0] = arr[i];
			return temp;
		}
		
		int mid = (i+j)/2;
		int fh[] = mergesort(arr, i, mid);
		int sh[] = mergesort(arr, mid+1, j);
		return merge(fh, sh);
	}
	public static int[] merge(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int ans[] = new int[arr.length+brr.length];
		int i =0;int j =0;int k =0;
		
		while(i<arr.length && j< brr.length) {
			if(arr[i]<brr[j]) {
				ans[k] = arr[i];
				i++;
			}
			else {
				ans[k] = brr[j];
				j++;
			}
			k++;
		}
		
		while(i<arr.length) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while(j<brr.length) {
			ans[k] = brr[j];
			j++;
			k++;
		}
		
		return ans;
	}

}
