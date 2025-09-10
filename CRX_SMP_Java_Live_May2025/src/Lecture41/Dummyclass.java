package Lecture41;

public class Dummyclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] c = new Car[5];
		
		c[0] = new Car(10000,201,"Maruti");
		c[1] = new Car(908763,300,"Suzuki");
		c[2] = new Car(89761,150,"Honda");
		c[3] = new Car(7654,101,"Toyota");
		c[4] = new Car(987,701,"Tata");
		
		Display(c);
		
	}

	private static void Display(Car[] c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
	}

}
