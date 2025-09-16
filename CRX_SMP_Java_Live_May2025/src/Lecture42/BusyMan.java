package Lecture42;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import Lecture41.Car;

public class BusyMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while(t-->0) {
			int noa = sc.nextInt();
			activity arr[] = new activity[noa];
			for (int i = 0; i < arr.length; i++) {
				activity a =  new activity();
				a.st = sc.nextInt();
				a.et = sc.nextInt();
				arr[i] = a;
			}
			Arrays.sort(arr,new Comparator<activity>() {

				@Override
				public int compare(activity o1, activity o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i].st + " "+ arr[i].et);
//			}
			int count =1;
			int cet = arr[0].et;
			for (int i = 1; i < arr.length; i++) {
				if(arr[i].st>=cet) {//activity picked
					count++;
					cet = arr[i].et;
				}
			}
			
			System.out.println(count);
		}
		
	}
	
	public static class activity{
		int st;
		int et;
	}

}
