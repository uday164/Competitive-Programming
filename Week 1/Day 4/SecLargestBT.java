import java.util.*;

class Node
{
	int data;
	Node left;
	Node right;

	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}


class SecLargestBT
{
    ArrayList<Integer> arr = new ArrayList<Integer>();

	Node root;

	SecLargestBT(int key)
	{
		root = new Node(key);
	}

	SecLargestBT()
	{
		root = null;
	}

	 void printInorder()
	 {
	      printInorder(root);   
	 }

	  void printInorder(Node node)
    {
        if (node == null)
            return;
 
        printInorder(node.left);

        arr.add(node.data);


 
        printInorder(node.right);
    }

    void SecLargest()
    {
    	System.out.println(arr.get(arr.size()-2));
    }


	public static void main(String[] args)
	{
		SecLargestBT tree = new SecLargestBT();

		tree.root = new Node(4);

		tree.root.left = new Node(2);
		tree.root.right = new Node(8);

		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);

	    tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(11);


		tree.printInorder();

		tree.SecLargest();


	}


}
