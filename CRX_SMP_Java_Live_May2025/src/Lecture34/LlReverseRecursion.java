package Lecture34;

import Lecture34.LLReverseStackLeetcode.ListNode;

public class LlReverseRecursion {

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
	
	 public ListNode reverseList(ListNode head) {
	        return reverse(head,null);
	 }

	public ListNode reverse(ListNode curr, ListNode prev) {
		// TODO Auto-generated method stub
		if(curr == null) {
			return prev;
		}
		ListNode temp = reverse(curr.next, curr);
		curr.next = prev;
		
		return temp;
	}

}
