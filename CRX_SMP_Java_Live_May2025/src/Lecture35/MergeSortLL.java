package Lecture35;

import Lecture35.MeregeTwoSortedList.ListNode;

public class MergeSortLL {

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

	public ListNode sortList(ListNode head) {
		if(head == null || head.next==null) {
			return head;
		}
		ListNode mid = middleNode(head);
		ListNode sh = mid.next;
		mid.next = null;
		ListNode A = sortList(head);
		ListNode B = sortList(sh);
		
		return mergeTwoLists(A, B);
		
	}
	public ListNode middleNode(ListNode head) {
		// TODO Auto-generated method stub
		ListNode slow = head;
		ListNode fast  = head;
		
		while( fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;//move pointer by twice the speed of slow
		}
		
		return slow;
	}
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		
		while(a!=null && b!=null) {
			if(a.val<b.val) {
				temp.next= a;
				a= a.next;
			}
			else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		
		if(a == null) {
			temp.next = b;
		}
		if(b ==null) {
			temp.next = a;
		}
		
		return dummy.next;
	}

}
