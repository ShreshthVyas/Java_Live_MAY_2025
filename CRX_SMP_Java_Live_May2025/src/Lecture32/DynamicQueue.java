package Lecture32;

import Lecture29.Queue;

public class DynamicQueue extends Queue{
	
	@Override
	public void Enqueue(int i) throws Exception {
		// TODO Auto-generated method stub
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			for (int j = 0; j < size; j++) {
				int idx = (front+j)%arr.length;
				newarr[j] = arr[idx];
			}
			this.arr  = newarr;
		}
		super.Enqueue(i);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		
		dq.Display();
	}

}
