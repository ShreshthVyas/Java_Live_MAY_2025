package Lecture10;

import java.util.Scanner;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t>0){
	            int n =sc.nextInt();
	            int m = sc.nextInt();

	            int a =0;
	            int h = 0;
	            int i =1;
	            while(true){
	                if(i%2 == 1){ // odd turn -> ayush
	                    if(a+i>n){// limit exceeded
	                        System.out.println("Harshit");
	                        break;
	                    }
	                    a+= i; // if limit allows add i meaning ayush buys these no. of phones
	                }
	                else{ // even turn -> harshit
	                    if(h+i>m){// limit exceeded
	                        System.out.println("Aayush");
	                        break;
	                    }
	                    h+= i; // if limit allows add i meaning harshit buys these no. of phones
	                }
	               
	                i++; // turn change
	            }

	            t--;// t --  for next case meaning one testcase complete
	        }
	}

}
