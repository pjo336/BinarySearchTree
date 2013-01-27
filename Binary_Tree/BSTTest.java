/**
*	@author Peter Johnston
*	Assignment 3: BinarySearchTree
*	email: pemjohns@gmail.com
*	course number: CSC 383-501
*	Due Date: August5, 2012
*
*	This Class tests the Binary Search Tree
**/
//Creates a BST of elements, prints its elements and checks 
// whether particular elements exist in the tree

public class BSTTest
{
	public static void main(String[] args)
	{
		testBinarySearchTreeInteger();
		testBinarySearchTreeString();
		
	}//end of main
	
	public static void testBinarySearchTreeInteger()
    {
		System.out.println("***This will test class BinarySearchTree using Integers***\n");
		
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		//add to the tree
		tree.add(50);
		tree.add(40);
		tree.add(60);
		tree.add(30);
		tree.add(70);
		tree.add(20);
		tree.add(80);
		tree.add(35);
		tree.add(65);
		
		//test print, toString and printSideways
		tree.print();
		System.out.println(tree.toString() );
		tree.printSideways();
		//test contains
		System.out.println(tree.contains(70) );
		System.out.println(tree.contains(35) );
		System.out.println(tree.contains(36) );
		System.out.println(tree.contains(0) );
		System.out.println(tree.contains(-70) );
		//test getMax, getMin, getDepth, and getNumLeaves
		System.out.println(tree.getMax() );
		System.out.println(tree.getMin() );
		System.out.println(tree.getDepth() );
		System.out.println(tree.getNumLeaves() );
		System.out.println();
	}
	
	public static void testBinarySearchTreeString()
	{
		System.out.println("***This will test class BinarySearchTree using Strings***\n");
		BinarySearchTree<String> tree2 = new BinarySearchTree<String>();
		//add Strings
		tree2.add("N");
		tree2.add("P");
		tree2.add("L");
		tree2.add("M");
		tree2.add("O");
		tree2.add("Z");
		tree2.add("A");
		//test print, toString, printSideways
		tree2.print();
		System.out.println(tree2.toString());
		tree2.printSideways();
		//test contains
		System.out.println(tree2.contains("A"));
		System.out.println(tree2.contains("B"));
		System.out.println(tree2.contains("ZA"));
		//test getMax and getMin
		System.out.println(tree2.getMax() );
		System.out.println(tree2.getMin() );
		//test getDepth and getNumLeaves
		System.out.println(tree2.getDepth() );
		System.out.println(tree2.getNumLeaves() );
		System.out.println();
	}

}//end of class BSTTest