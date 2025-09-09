package Lecture40;


public class llg<T> {
	
	public class Node{
		T val;
		Node next;
		public Node() {
			
		}
		public Node(T val , Node next) {
			this.val = val;
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	public void addFirst(T x) {
		if(this.size == 0) {//empty list
			Node nn = new Node();
			nn.val = x;
			this.head = nn;
			this.tail = nn;
		}
		else {
			Node nn = new Node();
			nn.val = x;
			nn.next = this.head;
			this.head = nn;
		}
		this.size++;
	}
	
	public void addLast(T x) {
		if(this.size == 0) {
			Node nn = new Node();
			nn.val = x;
			this.head = nn;
			this.tail = nn;
		}
		else {
			Node nn = new Node();
			nn.val= x;
			this.tail.next = nn;
			this.tail = nn;
		}
		this.size++;
	}
	
	public void Display() {
		
		Node temp = this.head;
		
		while(temp!=null) {
			System.out.print(temp.val + "==> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	public void addAtIdx(int idx,T item) {
		Node t = this.head;
		for (int i = 1; i < idx; i++) { // bring t to idx-1
			t = t.next;
		}
		
		Node nn = new Node();
		nn.val = item;
		nn.next = t.next;//IMP
		t.next = nn;
		
		this.size++;
	}
	
	public void removeFirst() {
		this.head = this.head.next;
		this.size--;
	}
	
	public void removeLast() {
		Node temp = this.head;
		while(temp.next!=this.tail) {//arrived on second last
			temp = temp.next;
		}
		this.tail = temp;
		temp.next = null;
		this.size--;
	}
	
	public void removeAtIdx(int idx) {
		Node t = this.head;
		for (int i = 1; i < idx; i++) { // bring t to idx-1
			t = t.next;
		}
		
		t.next = t.next.next;
		this.size--;
	}
	
	public T getMiddle() {
		int count =0;
		Node temp = this.head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		
		temp = this.head;
		for (int i = 0; i < count/2; i++) {
			temp = temp.next;
		}
		
		return temp.val;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llg<Integer> ll = new llg<>();
		llg<String> ll1 = new llg<>();
		llg<Double> ll2 = new llg<>();
		
	}

}
