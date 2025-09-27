package Lecture45;

import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestConsecutive(int[] nums) {
		HashMap<Integer, Boolean> map= new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {//O(N)
			if(map.containsKey(nums[i]-1)) {
				map.put(nums[i], false);
			}
			else {
				map.put(nums[i], true);
			}
			
			if(map.containsKey(nums[i]+1)) {
				map.put(nums[i]+1, false);
			}
		}
		int ans =0;
		for (int i : map.keySet()) {
			if(map.get(i)) {
				int count=0;
				while(map.containsKey(i)) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
	}

}
