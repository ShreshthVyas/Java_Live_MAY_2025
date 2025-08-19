package Lecture32;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		P obj = new P();
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		obj.f();
//		obj.f1();
		
//		C obj1 = new C();
//		System.out.println(((P)(obj1)).a);
//		System.out.println(obj1.a);
//		System.out.println(obj1.b);
//		System.out.println(obj1.c);
		
//		((P)(obj1)).f();
//		obj1.f1();
//		obj1.f2();
		
		P obj1 = new C();
//		System.out.println(obj1.a);
//		System.out.println(obj1.b);
//		System.out.println(((C)(obj1)).c);
//		System.out.println(((C)(obj1)).a);
		
		obj1.f();//Method Overriding
		obj1.f1();
		((C)(obj1)).f2();
		
//		C obj2 =  new P();
	}

}
