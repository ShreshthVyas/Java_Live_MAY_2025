package Lecture9;

public class LinearSearch {
	
	public static void main(String[] args) {
		int arr[] = {3,4,-2,-1,6,13};
		boolean ans = ls(arr,-1);
		System.out.println(ans);
	}

	public static boolean ls(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		
		return false;
	}
}
