package Lecture43;

import java.util.HashSet;

public class TargetSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println(check(arr,7));
	}

	private static boolean check(int[] arr, int target) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(target-arr[i])) {
				System.out.println(arr[i]+ " " + (target-arr[i]));
//				return true;
			}
			set.add(arr[i]);
		}
		return false;
		
		
	}

}
