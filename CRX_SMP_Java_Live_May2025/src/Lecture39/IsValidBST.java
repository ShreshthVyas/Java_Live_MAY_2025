package Lecture39;

import Lecture39.DeleteinBST.TreeNode;

public class IsValidBST {

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

	public boolean isValidBST(TreeNode root) {
		return check(root).isBST;
	}
	public bstpair check(TreeNode root) {
		if(root == null) {
			return new bstpair();
		}
		
		bstpair left = check(root.left);
		bstpair right  =  check(root.right);
		
		bstpair self =  new bstpair();
		self.max = Math.max(root.val, Math.max(left.max, right.max));
		self.min = Math.min(root.val, Math.min(left.min, right.min));
		self.isBST = left.isBST && right.isBST &&
				root.val>left.max && root.val<right.min;
				
		return self;
	}
	
	public class bstpair{
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		boolean isBST = true;
	}

}
