package Lecture42;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq =  new PriorityQueue<>();//min heap
		PriorityQueue<Integer> pq1 =  new PriorityQueue<>(Collections.reverseOrder());//max heap
		
		pq.add(50);
		pq.add(20);
		pq.add(40);
		pq.add(30);
		pq.add(10);
		
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		
		
	}

}
