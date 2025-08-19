package Lecture32;

import Lecture29.stack;

public class DynamicStack extends stack{
	
	@Override
	public void push(int x) throws Exception {
		// TODO Auto-generated method stub
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {//copy all values
				newarr[i] = arr[i];
			}
			this.arr  = newarr;
		}
		super.push(x);
	}
	
	public static void main(String[] args) throws Exception {
		DynamicStack s = new DynamicStack();
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(10);
		
		s.Display();
		
	}
}