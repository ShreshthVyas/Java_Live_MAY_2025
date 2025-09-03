package Lecture38;

import java.util.ArrayList;
import java.util.List;

import Lecture38.FlipEquivalentLeetcode.TreeNode;

public class RightView {
	
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
	
	List<Integer> ans;
	int maxLvl;
	public List<Integer> rightSideView(TreeNode root) {
        ans = new ArrayList<Integer>();
        maxLvl = -1;
        rec(root,0);
        return ans;
    }
	private void rec(TreeNode root, int cl) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		if(maxLvl<cl) {
			ans.add(root.val);
			maxLvl = cl;
		}
		
		rec(root.right, cl+1);
		rec(root.left, cl+1);
	}
}
