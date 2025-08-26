package Lecture35;

public class CycleRemoval {

	public class Node {
		int val;
		Node next;

		public Node() {

		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	public void addFirst(int x) {
		if (this.size == 0) {// empty list
			Node nn = new Node();
			nn.val = x;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = x;
			nn.next = this.head;
			this.head = nn;
		}
		this.size++;
	}

	public void addLast(int x) {
		if (this.size == 0) {
			Node nn = new Node();
			nn.val = x;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = x;
			this.tail.next = nn;
			this.tail = nn;
		}
		this.size++;
	}

	public void Display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.val + "==> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void createCycle(int idx) {
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		this.tail.next = temp;
	}

	// O(N^2)
	public void removeCycle() {
		Node mp = meetpoint();
		if (mp == null) {// no cycle
			return;
		}

		Node c = this.head;
		while (c != null) {
			Node temp = mp;

			while (temp.next != mp) {// to traverse in cycle
				if (temp.next == c) {// starting point found
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			c = c.next;
		}

	}

	public Node meetpoint() {
		// TODO Auto-generated method stub
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {// MeetPoint found
				return slow;
			}
		}

		return null;
	}

	// O(N)
	public void CycleRemovalOptimised() {
		Node mp = meetpoint();
		if (mp == null) {// no cycle
			return;
		}

		Node temp = mp;
		int count = 1;

		// Step 1
		while (temp.next != mp) {// cyclic length
			temp = temp.next;
			count++;
		}
		Node fast = head;
		Node slow = head;

		// Step 2
		// Move Fast cyclic length times
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}

		// Step 3
		while (fast.next != slow.next) {
			fast = fast.next;
			slow = slow.next;
		}

		fast.next = null;// cycle remove

	}

	public void FloydCycleRemoval() {
		Node mp = meetpoint();
		if (mp == null) {// no cycle
			return;
		}
		Node fast = mp;
		Node slow = head;

		while (fast.next != slow.next) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next = null;
	}

}
