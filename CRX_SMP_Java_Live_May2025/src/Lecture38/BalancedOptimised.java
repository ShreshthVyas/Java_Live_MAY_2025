package Lecture38;

import Lecture37.DiameterLeetCode.TreeNode;

public class BalancedOptimised {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	public class balpair{
		int h = -1;
		boolean isbal = true;
	}

	public boolean isBalanced(TreeNode root) {
		return balanced(root).isbal;
	}
	public balpair balanced(TreeNode root) {
		if(root == null) {
			return new balpair();
		}
		balpair lbp =  balanced(root.left);
		balpair rbp =  balanced(root.right);
		balpair sbp = new balpair();
		sbp.h = Math.max(lbp.h, rbp.h) + 1;
		boolean sb = Math.abs(lbp.h - rbp.h) <=1;
		sbp.isbal = lbp.isbal && rbp.isbal && sb;
		
		return sbp;
	}

}
