import java.util.*;

class Node
{
	int val;
	Node left; 
	Node right;

	Node(int d) {
		this.val = d;
		this.left = null;
		this.right = null;
	}
}

/*
		1
	2		1
1		1		
Ans = 3
*/

class Day8_CountUnivalTrees
{
	static boolean is_Unival(Node root){
		return checkUnival(root, root.val);
	}

	static boolean checkUnival(Node root, int val){
		if(root == null)
			return true;

		if(root.val == val)
			return checkUnival(root.left, val) && checkUnival(root.right, val);

		return false;
	}

	static int countUnival(Node root) {
		if(root == null)
			return 0;
		int leftCount = countUnival(root.left);
		int rightCount = countUnival(root.right);

		if(is_Unival(root)){
			return leftCount+rightCount+1;
		} else {
			return leftCount+rightCount;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Node root = new Node(1);
		root.left = new Node(1);
		root.right = new Node(1);
		root.left.left = new Node(2);
		root.left.right = new Node(1);

		System.out.println(countUnival(root));
	}
}