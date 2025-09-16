package Lecture42;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeKLists(ListNode[] arr) {
		PriorityQueue<ListNode> pq =  new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=null) {
				pq.add(arr[i]);
			}
			
		}
		ListNode newhead = new ListNode();
		ListNode temp = newhead;
		
		while(!pq.isEmpty()) {
			ListNode a = pq.remove();
			temp.next = a;
			temp = temp.next;
			if(a.next!=null) {
				pq.add(a.next);
			}
		}
		
		return newhead.next;
		
	}
}
