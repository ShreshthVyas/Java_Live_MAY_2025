package Lecture40;

public class heapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h =  new Heap();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
		
		System.out.println(h.remove());
		h.Display();
		System.out.println(h.remove());
		
		h.add(0);
		
		h.Display();
	}

}
