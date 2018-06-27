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

class Day8_CountUnivalTreesOptimized {

	static int[] countUnivalTrees(Node root)
	{
		if(root == null){
			int base[] = {0,1};
			return base;
		}

		int left[] = countUnivalTrees(root.left);
		int right[] = countUnivalTrees(root.right);

		int totalCount = left[0]+right[0];

		if(left[1]==1 && right[1]==1){
			if(root.left != null && root.val != root.left.val){
				int leftCount[] = {totalCount, 0};
				return leftCount;
			}
			if(root.right != null && root.val != root.right.val){
				int rightCount[] = {totalCount, 0};
				return rightCount;
			}
			int totalCountArray[] =  {totalCount+1, 1};
			return totalCountArray;
		}
		int def[]=  {totalCount,0};
		return def;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(1);
		root.right = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(1);

		int arr[] = countUnivalTrees(root);

		System.out.println(arr[0]);		
	}
}