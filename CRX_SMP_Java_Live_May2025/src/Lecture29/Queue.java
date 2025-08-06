package Lecture29;

public class Queue {
	
	private int arr[];
	private int front = 0;
	private int size =0;
	
	public Queue() {
		this.arr = new int[5];
	}
	public Queue(int size) {
		this.arr = new int[size];
	}
	public boolean isEmpty() {//O(1)
		return this.size == 0;	
	}
	public boolean isFull() {
		return this.size == this.arr.length;
	}
	
	//O(1);
	public void Enqueue(int i) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		int idx = (front +size)% arr.length;
		arr[idx] = i;
		this.size++;
	}
	
	//O(1)
	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp  = arr[front];
		arr[front] = 0;
		front = (front+1)%arr.length;
		this.size--;
		return temp;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return arr[front];
	}
	
	public int size() {
		return this.size;
	}
	
	public void Display() {
		
		for (int i = 0; i < size; i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
	
	
}
