package Lecture36;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BinaryTree {

	public class Node{
		int data;
		Node left;
		Node right;
		
		public Node() {
			
		}
		public Node(int data,Node left,Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	private Node root;
	Scanner sc =  new Scanner(System.in);
	
	public BinaryTree() {
		this.root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		int val = sc.nextInt();
		Node nn = new Node();
		nn.data = val;
		
//		System.out.println("Has Left Child ?");
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = createTree();
		}
		
//		System.out.println("Has Right Child ?");
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = createTree();
		}
		
		return nn;
	}
	
	public void Display() {
		display(root);
	}

	private void display(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		String s = root.data +"";
		if(root.left!=null) {
			s =  root.left.data+" <== " + s;
		}
		else {
			s =  ". <== " + s;
		}
		if(root.right!=null) {
			s = s + "==>" + root.right.data;
		}
		else {
			s =  s+"==> .";
		}
		System.out.println(s);
		display(root.left);
		display(root.right);
		
	}
	
	public int Max() {
		 return max(root);
	}

	private int  max(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		int left_max = max(node.left);
		int right_max = max(node.right);
		
		return Math.max(node.data, Math.max(left_max, right_max));
	}
	
	public int Min() {
		return min(root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return Integer.MAX_VALUE;
		}
		int left_min = max(node.left);
		int right_min = max(node.right);
		
		return Math.min(node.data, Math.min(left_min, right_min));
	}
	
	public boolean Find(int t) {
		return find(root,t);
	}

	private boolean find(Node node, int t) {
		if(node == null) {
			return false;
		}
		if(node.data == t) {
			return true;
		}
		boolean left = find(node.left, t);
		boolean right = find(node.right, t);
		
		return left || right;
	}
	
	public int Height() {
		return height(root);
	}

	private int height(Node node) {
		// TODO Auto-generated method stub
		if(node ==null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		
		return Math.max(lh, rh) + 1;
	}
	
	public void PreOrder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node node) {//NLR
		// TODO Auto-generated method stub
		if(node ==null) {
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
		
	}
	public void InOrder() {
		inorder(root);
		System.out.println();
	}

	private void inorder(Node node) {//LNR
		// TODO Auto-generated method stub
		if(node ==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public void PostOrder() {
		postorder(root);
		System.out.println();
	}
	
	private void postorder(Node node) {//LRN
		// TODO Auto-generated method stub
		if(node ==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.remove();
			System.out.print(temp.data+" ");
			
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		
		
	}
	
}

