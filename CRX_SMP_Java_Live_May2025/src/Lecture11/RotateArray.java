package Lecture11;

public class RotateArray {
	// https://leetcode.com/problems/rotate-array/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void rotate(int[] nums, int k) {
		int n  = nums.length;
		k = k % n;// after every n rotations array repeats itself
		
		reverse(0,n-1,nums);
		reverse(0,k-1,nums);
		reverse(k,n-1,nums);
	}

	public void reverse(int i, int j, int[] nums) {
		// TODO Auto-generated method stub
		while(i<j) {
			int t =  nums[i];
			nums[i] = nums[j];
			nums[j] = t;
			
			i++;
			j--;
		}
		
	}

}
