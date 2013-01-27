/**
*	@author Peter Johnston
*	Assignment 3: BinarySearchTree
*	email: pemjohns@gmail.com
*	course number: CSC 383-501
*	Due Date: August5, 2012
*
*	This Class creates the Binary Search Tree
**/
// TreeNode objects stores a single node of a binary tree of ints.

public class TreeNode<T extends Comparable<T>>
{
    public T data;            // data stored at this node
    public TreeNode<T> left;    // reference to left subtree
    public TreeNode<T> right;   // reference to right subtree

    // Constructs a leaf node with the given data.
    public TreeNode(T data)
    {
        this(data, null, null);
    }

    // Constructs a leaf or branch node with the given data and links.
    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
