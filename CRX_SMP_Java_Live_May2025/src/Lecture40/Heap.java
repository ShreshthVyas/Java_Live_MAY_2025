package Lecture40;

import java.util.ArrayList;

public class Heap {
	
	private ArrayList<Integer> heap;
	
	public Heap() {
		heap = new ArrayList<>();
	}
	
	//O(LogN)
	public void add(int val) {
		heap.add(val);//O(1)
		upheapify(heap.size()-1);
	}

	private void upheapify(int ci) {//O(Log(N)
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		
		if(heap.get(pi)>heap.get(ci)) {
			swap(pi,ci);
			upheapify(pi);
		}
		
	}
	
	public int remove() {//O(LogN)
		int rv = heap.get(0);
		swap(0, heap.size()-1);
		heap.remove( heap.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int c1 = 2*pi +1;
		int c2 = 2*pi+2;
		int mini = pi;
		
		if(c1<heap.size() && heap.get(c1)<heap.get(mini)) {
			mini = c1;
		}
		if(c2<heap.size() && heap.get(c2)<heap.get(mini)) {
			mini = c2;
		}
		
		if(mini!=pi) {
			swap(pi, mini);
			downheapify(mini);
		}
		
	}

	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int tc = heap.get(ci);
		int tp  = heap.get(pi);
		
		heap.set(pi, tc);
		heap.set(ci, tp);
	}
	
	public void Display() {
		System.out.println(heap);
	}
	
}
