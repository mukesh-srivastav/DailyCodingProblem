import java.util.*;

class Node 
{
    int val ; 
    Node left; 
    Node right;

    // To create the node with a given value.
    Node(int d){
        this.val = d;
        this.left = null;
        this.right = null;
    }
}

class Day3_SerializeAndDeserializeTree
{
    Queue<Node> queue = new LinkedList<Node>();

    //method for inorderTraversal
    void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.val+"");
            inOrder(node.right);
        }
    }

    //stores the tree into the queue.
    void Serialize(Node node) {
        if (node == null) {
            queue.add(new Node(-1));
            return;
        }

        queue.add(new Node(node.val));
        Serialize(node.left);
        Serialize(node.right);
    }

    //generates the tree by polling elements from queue.
    Node DeSerialize(Node node) {
        Node n1  = queue.poll();

        if(n1==null || n1.val == -1) {
            return null; 
        }
        node = new Node(n1.val);
        node.left = DeSerialize(node.left);
        node.right = DeSerialize(node.right);

        return node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        //creating the tree.
        Day3_SerializeAndDeserializeTree tree = new Day3_SerializeAndDeserializeTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Inorder Traversal.
        tree.inOrder(root);
        System.out.println();

        tree.Serialize(root);

        // For testing purpose.
        // Queue<Node> queue = tree.queue ; 
        // while (!queue.isEmpty()) {
        //     System.out.print(queue.poll().val+"");
        // }
        //tree.inOrder(root);
        
        // System.out.println(root.val);

        Node node = tree.DeSerialize(root);
        tree.inOrder(node);
        System.out.println();

    }
}