package Lecture9;

public class RainWaterTrapping {
	//https://leetcode.com/problems/trapping-rain-water/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int trap(int[] height) {
	    int leftmax [] = new int[height.length];
	    int rightmax [] = new int[height.length];
	    
	    leftmax[0] = height[0];
	    for (int i = 1; i < rightmax.length; i++) {
			leftmax[i] = Math.max(height[i], leftmax[i-1]);
		}
	    
	    rightmax[height.length-1] = height[height.length-1];
	    for (int i = height.length-2; i >=0; i--) {
	    	rightmax[i] = Math.max(height[i], rightmax[i+1]);
	    }
	    int sum =0;
	    for (int i = 0; i < rightmax.length; i++) {
			sum += Math.min(leftmax[i], rightmax[i])  - height[i];
		}
	    
	    return sum;
	 }

}
