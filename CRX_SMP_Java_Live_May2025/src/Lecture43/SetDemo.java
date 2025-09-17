package Lecture43;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer> set =  new HashSet<>();
//		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		TreeSet<Integer> set =  new TreeSet<>();
		//O(1)
		set.add(100);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		System.out.println(set);
		
		//O(1)
		System.out.println(set.contains(20));
		
		//O(1)
		set.remove(10);
		
		System.out.println(set);
		
		for (Integer i : set) {
			System.out.println(i);
		}
	}

}
