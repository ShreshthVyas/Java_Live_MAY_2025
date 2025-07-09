package Lecture18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
//		ArrayList<Character> list1 = new ArrayList<>();
		
		list.add("Abc");
		list.add("Abcd");
		list.add("Ac");
		list.add("bc");
		list.add("Abdc");
		list.add("Abcd");
		list.add("Axbc");
		list.add("Abcc");
		
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.addLast("abcdf");
		list.addFirst("123");
		
		System.out.println(list);
		
		list.add(2, "s");
		
		System.out.println(list.get(0));
		
		list.remove(2);
		
		System.out.println(list);
		
		list.set(0, "sdf");
		
		System.out.println(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i)+", ");
//		}
		
		for (String s : list) {
			System.out.print(s+ "-");
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		int a = sc.nextInt();
		list1.add(a);
		
		for (Integer i : list1) {
			System.out.print(i+ "-");
		}
	}

}
