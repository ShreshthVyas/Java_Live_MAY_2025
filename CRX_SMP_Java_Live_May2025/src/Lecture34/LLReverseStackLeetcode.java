package Lecture34;

import java.util.Stack;

import Lecture34.LLMIddleLeetcode.ListNode;

public class LLReverseStackLeetcode {

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
		 if(head == null){
	            return null;
	     }
		 Stack<ListNode> st = new Stack<>();
		 
		 ListNode temp = head;
		 
		 while(temp!=null) {//push all nodes in stack
			 st.push(temp);
			 temp = temp.next;
		 }
		 
		 head = st.pop();
		 temp = head;
		 
		 while(!st.isEmpty()) {
			 ListNode rv = st.pop();
			 temp.next =rv;
			 temp = temp.next;
		 }
		 temp.next =  null;// To remove cycle
		 return head;
	        
	}
}
