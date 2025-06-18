package Lecture11;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  =  {-1,2,5,7,12,119,209};
		
		boolean ans = binarysearch(arr,51);
		System.out.println(ans);
	}

	public static boolean binarysearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr.length-1;
		
		while(i<=j) {
			int mid = (i+j)/2;
			if(arr[mid] == target) { // target found
				return true;
			}
			else if(arr[mid]>target) {
				j  = mid-1;
			}
			else {
				i = mid+1;
			}
		}
		
		return false;
		
		
	}

}
