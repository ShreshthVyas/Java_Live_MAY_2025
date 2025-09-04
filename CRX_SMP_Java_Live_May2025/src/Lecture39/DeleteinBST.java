package Lecture39;

import Lecture38.FlipEquivalentLeetcode.TreeNode;

public class DeleteinBST {

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

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) {
			return null;
		}
		if(key<root.val) {
			root.left = deleteNode(root.left, key);
		}
		else if ( key>root.val) {
			root.right = deleteNode(root.right, key);
		}
		else {//key found
			
			// Both null || left null but right not null
			if(root.left==null) {
				return root.right;
			}
			else if (root.right == null) {//right null but left not null
				return root.left;
			}
			else {//both children present
				int leftmax = max(root.left);//get left max
				root.left = deleteNode(root.left, leftmax);//delete left max
				root.val = leftmax;
			}
			
		}
		return root;
	}

	private int max(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int value = max(root.right);
		
		return Math.max(value, root.val);
	}

}
