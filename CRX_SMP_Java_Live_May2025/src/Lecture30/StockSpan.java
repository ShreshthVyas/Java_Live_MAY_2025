package Lecture30;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 30 , 35 , 40 ,38 ,35 };
		Stack<Integer> st =  new Stack<>();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {// all prev elements were smaller than me
				ans[i] = i+1;//all elements before me inc me
			}
			else { // find no. of elements b/w me and the last mountain peak
				ans[i] = i - st.peek();
			}
			st.push(i);
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
