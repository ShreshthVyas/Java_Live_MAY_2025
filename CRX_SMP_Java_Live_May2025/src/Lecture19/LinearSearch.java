package Lecture19;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,4,-3,5,7,1,9};
		
		boolean ans = ls(arr,99,0);
		
		System.out.println(ans);
		
	}

	public static boolean ls(int[] arr, int target,int idx) {
		// TODO Auto-generated method stub
		if(idx == arr.length) {
			return false;
		}
		
		if(arr[idx] == target) {// target found 
			return true;
		}
		boolean temp = ls(arr, target, idx+1);
		return temp; 
	}

}
