package Lecture11;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum =0;
		
		for (int i = 0; i < nums.length; i++) {
			sum+= nums[i];
			max = Math.max(max, sum);
			if(sum<0) {//fund new starting point
				sum =0;
			}
		}
		
		return max;
	}

}
