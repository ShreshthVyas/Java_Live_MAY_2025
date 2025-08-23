package Lecture34;

public class LLMIddleLeetcode {

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

	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast  = head;
		
		while( fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;//move pointer by twice the speed of slow
		}
		
		return slow;
	}
}
