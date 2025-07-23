package Lecture24;

public class QueenCombination {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n  =4;
			int noq = 2;
			boolean board[] = new boolean[n];
			queen(board,0,noq,"",0);
		}

		public static void queen(boolean[] board, int cq, int noq, String ans,int idx) {
			// TODO Auto-generated method stub
			if(cq == noq) {
				System.out.println(ans);
				return;
			}
			
			for (int i = idx; i < board.length; i++) {
				if(board[i] == false) {// cell empty
					board[i] = true;
					queen(board, cq+1, noq, ans+"b"+i+"q"+cq,i+1);
					board[i] = false;// backtracking
				}
			}
			
			
	}

}
