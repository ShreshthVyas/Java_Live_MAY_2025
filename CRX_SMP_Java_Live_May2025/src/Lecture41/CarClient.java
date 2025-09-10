package Lecture41;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c[] =  new Car[5];
		
		c[0] = new Car(2929829 , 202 , "Maruti");
		c[1] = new Car(29829 , 2010 , "Suzuki");
		c[2] = new Car(10000 , 201 , "Toyota");
		c[3] = new Car(7890 , 178 , "Tata");
		c[4] = new Car(9807 , 1 , "Random");
		
		Arrays.sort(c,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o1.price-o2.price;
//				return o2.speed-o1.speed;
			}
		});
		Display(c);
	}

	private static void Display(Car[] c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
//	public static <T extends Comparable<T>>void sort(T[] arr) {
//		// TODO Auto-generated method stub
//		
//		for (int pass = 1; pass < arr.length; pass++) {
//			for (int i = 0; i < arr.length-pass; i++) {
//				if(arr[i].compareTo(arr[i+1])>0) {
//					T t = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = t;
//				}
//			}
//		}
//		
//	}

}
