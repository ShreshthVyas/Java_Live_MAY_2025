package Lecture37;

public class PathSumLeetcode {

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

	public boolean hasPathSum(TreeNode root, int target) {
		if(root == null) {//-ve base case
			return false;
		}
		if(root.left == null && root.right ==null ) {//leaf node
			return target == root.val;
		}
		
		boolean left = hasPathSum(root.left, target - root.val);
		boolean right = hasPathSum(root.right, target - root.val);
		
		return left||right;
		
	}
}
