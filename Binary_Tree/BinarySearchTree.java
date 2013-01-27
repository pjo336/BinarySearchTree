/**
*	@author Peter Johnston
*	Assignment 3: BinarySearchTree
*	email: pemjohns@gmail.com
*	course number: CSC 383-501
*	Due Date: August5, 2012
*
*	This Class creates multiple methods to use on our Binary Search Tree
**/
// A BinarySearchTree object represents an entire binary search tree.
// left sub tree values are less than the root
// right sub tree values are greater than the root

public class BinarySearchTree<T extends Comparable<T>>
{
	private TreeNode<T> overallRoot;

	// Constructs an empty binary tree
	public BinarySearchTree()
	{
		overallRoot = null;
	}

	// Constructs a binary tree with the given node as its root.
	public BinarySearchTree(TreeNode<T> overallRoot)
	{
		this.overallRoot = overallRoot;
	}

	// Prints all elements of this tree in left to right order.
	public void print()
	{
		print(overallRoot);
		System.out.println();
	}

	// Prints a portion of the overall tree
	private void print(TreeNode<T> root)
	{
		// implicit base case: if null, do nothing
		if (root != null)
		{
			print(root.left);					// print my left sub-tree
			System.out.print(root.data + " ");	// print myself
			print(root.right);					// print my right sub-tree
		}
	}

	// Returns true if the overall tree contains the given target value,
	// false otherwise
	public boolean contains(T target)
	{
		return contains(overallRoot, target);
	}

	// Returns true if a portion of the overall tree contains the given
	// target value, false otherwise.
	private boolean contains(TreeNode<T> root, T target)
	{
		if (root == null)
		{
			return false;
		}
		else if (target.compareTo(root.data) < 0)
		{
			return contains(root.left, target);
		}
		else if (target.compareTo(root.data) > 0)
		{
			return contains(root.right, target);
		}
		else
			return true;
	}
	
	// Adds the value to the tree such that sorted BST order is maintained
	public void add(T value)
	{
		overallRoot = add(overallRoot, value);
	}

	// Adds the value to the given subtree.  Does not add duplicates.
	// A node's initial state is passed in and its modified 
	// state is returned.  This is the x = change(x) pattern and
	// it allows attaching new nodes to the tree.
	private TreeNode<T> add(TreeNode<T> root, T value)
	{
		
		if (root == null)
		{
			root = new TreeNode<T>(value);
			
		} 
		else if (value.compareTo(root.data) < 0)
		{
			root.left = add(root.left, value);
		}
		else if (value.compareTo(root.data) > 0)
		{
			root.right = add(root.right, value);
		}
	return root;
	}//end of private add method
	
	//getMax returns the element with the largest value
	public T getMax()
	{
		TreeNode<T> maxNode =  getMax(overallRoot);
		return maxNode.data;
	}
	//uses recursion to find the max
	private TreeNode<T> getMax(TreeNode<T> root)
	{
		if(root != null)
			while(root.right != null)
				root = root.right;
		return root;
	}
	
	//getMin returns the element with the smallest value
	public T getMin()
	{
		TreeNode<T> minNode = getMin(overallRoot);
		return minNode.data;
	}
	
	//private getMin uses recursion to find the min
	private TreeNode<T> getMin(TreeNode<T> root)
	{
		if(root != null)
			while(root.left != null)
				root = root.left;
		return root;
	}
	
	//getDepth returns the depth of the tree, returns -1 if tree is empty
	public int getDepth()
	{
		if(overallRoot == null)
	        return -1;
	    
	    else
	    {
	        TreeNode<T> depth = overallRoot;
	        return getDepth(depth);
	    }	
	}
	//uses recursion to find depth of left and right nodes
	private int getDepth(TreeNode<T> root)
	{
		int left = -1; //left depth
		int right = -1; //right depth
		
		if(root.left!=null)
	        left = getDepth(root.left);
	    if(root.right!=null)
	        right = getDepth(root.right);
	    if(left > right){
	        return left +1;
	    }
	    else{
	        return right +1;
	    }
	}
	
	//getNumLeaves returns the number of leaves in the tree
	public int getNumLeaves()
	{
		if(overallRoot == null)
			return 0;
		int leaf = 0;
		TreeNode<T> leaves = overallRoot;
		return getNumLeaves(leaves, leaf);
	}
	
	private int getNumLeaves(TreeNode<T> root, int leaf)
	{
		if(root == null)
			return 0;
		if(root.left == null && root.right ==null)
			return 1;
		else
		return getNumLeaves(root.right, leaf) + getNumLeaves(root.left, leaf);
		
		
	}
	
	//toString returns a string of the elements "inOrder"
	public String toString()
	{
		StringBuffer s = new StringBuffer();
		s.append("{");
		toString(overallRoot, s);
		s.append("}");
		return s.toString();
	}
	
	private StringBuffer toString(TreeNode<T> root, StringBuffer s)
	{
		// implicit base case: if null, do nothing
		if (root != null)
		{
			toString(root.left, s);		// append my left sub-tree
			s.append(root.data + " ");	// append myself
			toString(root.right, s);	// append my right sub-tree
		}
		return s;
	}
	
	//printSideways
	public void printSideways()
	{
	    printSideways(overallRoot, "");
	}

	private void printSideways(TreeNode<T> root, String indent)
	{
	   if (root != null)
	   {
	        printSideways(root.right, indent + "    ");
	        System.out.println(indent + root.data);
	        printSideways(root.left, indent + "    ");
	    }
	}
}//end of class BinarySearchTree
