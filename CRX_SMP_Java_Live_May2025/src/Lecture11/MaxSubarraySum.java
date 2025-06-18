package Lecture11;

public class MaxSubarraySum {
	// https://leetcode.com/problems/maximum-subarray/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4};
		maxSubArray(arr);
	}

	public static int maxSubArray(int[] nums) {
		int max =  Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) { // start of subarray
			int sum =0;
			for (int j = i; j < nums.length; j++) {// end point i.e subarray between i and j
				sum+= nums[j];
				max = Math.max(max, sum);
				
//				for (int k = i; k <=j; k++) {
//					System.out.print(nums[k]+ " ");
//				}
//				System.out.println();
			}
		}
		
		return max;
	}

}
