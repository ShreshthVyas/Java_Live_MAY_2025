package Lecture14;

public class WavePrint2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34},
				{41, 42, 43, 44} };
		
		for (int i = 0; i < arr.length; i++) {// rows
			
			if(i%2 == 0) {//even index rows
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			}
			else {//Odd index rows
				for (int j = arr[0].length-1; j>=0; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
			
		}
	}

}
