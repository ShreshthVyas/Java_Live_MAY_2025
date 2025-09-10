package Lecture41;

public class Car <T> implements Comparable<Car> {
	int price;
	int speed;
	String name;
	
	public Car(int price , int speed ,String name) {
		this.price = price;
		this.speed = speed;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.price + " " + this.speed;
	}

	@Override
	public int compareTo(Car obj) {
		// TODO Auto-generated method stub
//		return this.speed -  obj.speed;
//		return obj.speed -  this.speed;
//		return obj.price -  this.price;
//		return this.price -  obj.price;
		
		return this.name.compareTo(obj.name);
	}
	
}
