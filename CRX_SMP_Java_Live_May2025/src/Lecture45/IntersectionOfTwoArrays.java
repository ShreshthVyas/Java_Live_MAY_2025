package Lecture45;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] intersection(int[] nums1, int[] nums2) {//O(N)
	    HashSet<Integer> set = new HashSet<>();
	    HashSet<Integer> ans = new HashSet<>();
	    
	    for (int i : nums1) {//O(N)
			set.add(i);
		}
	    
	    for (int i : nums2) {//O(M)
	    	if(set.contains(i)) {//common element
	    		ans.add(i);
	    	}
		}
	    int arr[] = new int[ans.size()];
	    int idx =0;
	    
	    for (int i : ans) {
			arr[idx] = i;
			idx++;
		}//O(M+N)
	   
	    return arr;
	}

}
