package Lecture31;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {101,10,7,6,9,12,1,100,3,2};
		int ans[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < ans.length; i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				int idx = st.pop();
				ans[idx] = arr[i];
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));
		
		
	}

}
