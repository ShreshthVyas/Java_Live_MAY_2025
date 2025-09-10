package Lecture41;

public class Queue extends Dummyclass implements QueueI,StackI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q =  new Queue();
		q.enqueue();
		q.dequeue();
		q.peek();
	}

	@Override
	public void enqueue() {
		// TODO Auto-generated method stub
		System.out.println("enqueue");
	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub
		System.out.println("dequeue");
	}

	@Override
	public void peek() {
		// TODO Auto-generated method stub
		System.out.println("peek");
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

}
