package Lecture25;


import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[9][9];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sudoku(arr,0,0);
	}

	public static void sudoku(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub

		if(col==9) {
			row++;
			col=0;

		}
		if(row ==9) {
			Display(arr);
			return;
		}
		if(arr[row][col]!=0) {
			sudoku(arr, row, col+1);
		}
		else {
			for (int val = 1; val <=9; val++) {
				if(isItPossible(arr,val,row,col)) {
					
					arr[row][col] = val;
					sudoku(arr, row, col+1);
					arr[row][col] = 0;//backtrack
				}
			}
		}
		
	}

	public static boolean isItPossible(int[][] arr, int val, int row, int col) {
		// TODO Auto-generated method stub
		// vertical col
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][col] == val) {
				return false;
			}
		}
		
		//row
		for (int i = 0; i < arr.length; i++) {
			if(arr[row][i] == val) {
				return false;
			}
		}
		
		//3*3 square
		int sr = row - row%3;
		int sc = col-col%3;
		
		for (int r = sr; r < sr+3; r++) {
			for (int c = sc; c < sc+3; c++) {
				if(arr[r][c] == val) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void Display(int[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
