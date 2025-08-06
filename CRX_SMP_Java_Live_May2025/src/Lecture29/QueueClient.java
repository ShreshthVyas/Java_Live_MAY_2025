package Lecture29;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q =  new Queue();
		q.Enqueue(1);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Display();
		q.Dequeue();
		
		q.Display();
		
		q.Dequeue();
		
		q.Enqueue(100);
		
		q.Display();
		
		
	}

}
