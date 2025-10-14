package Lecture51;

public class MinCostClimbing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minCostClimbingStairs(int[] cost) {
		int zero = rec(cost,0);
		int first = rec(cost,1);
		return Math.min(zero, first);
	}

	private int rec(int[] cost, int i) {
		// TODO Auto-generated method stub
		if(i>= cost.length) {//reached end
			return 0;
		}
		int stepone = rec(cost, i+1);
		int steptwo = rec(cost, i+2);
		
		return cost[i] + Math.min(stepone, steptwo) ;
	}

}
