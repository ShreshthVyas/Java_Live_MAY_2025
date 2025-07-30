package Lecture25;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =5;
		boolean board[][] = new boolean[n][n];
		rec(board,n,0);
	}

	public static void rec(boolean[][] board, int n, int row) {
		// TODO Auto-generated method stub
		if(row == n) {
			Display(board);
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if(isItpossible(board,row,col)) {
				board[row][col] = true;//queen placed
				rec(board, n, row+1);//rec call
				board[row][col] = false;
			}
		}
		
	}

	public static boolean isItpossible(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// vertically up
		for (int i = row; i>=0; i--) {
			if(board[i][col]) {
				return false;
			}
		}
		//left upper diagonal
		int cr = row;
		int cc = col;
		while(cr>=0 && cc>=0) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;
		}
		//right upper diagonal
		cr = row;
		cc = col;
		while(cr>=0 && cc<board.length) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;
		}
		
		
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]) {
					System.out.print("Q");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
