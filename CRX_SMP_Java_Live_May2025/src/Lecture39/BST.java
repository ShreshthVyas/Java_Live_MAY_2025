package Lecture39;

public class BST {

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
	
	public BST(int in[]) {
		this.root =  createTree(in,0,in.length-1);
	}
	
	
	private Node createTree(int[] in,int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		
		int mid = (si+ei)/2;
		Node nn =  new Node();
		nn.data = in[mid];
		
		nn.left = createTree(in, si, mid-1);
		nn.right = createTree(in,mid+1, ei);
		
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

}
