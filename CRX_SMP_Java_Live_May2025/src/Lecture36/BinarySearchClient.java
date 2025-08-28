package Lecture36;

public class BinarySearchClient {
	//10 true 20 true 40 false false true 50 false false true 30 false true 80 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt =  new BinaryTree();
//		System.out.println(bt.Max());
//		System.out.println(bt.Min());
//		System.out.println(bt.Find(400));
//		System.out.println(bt.Height());
//		bt.Display();
		bt.PreOrder();
		bt.InOrder();
		bt.PostOrder();
		bt.LevelOrder();
	}

}
