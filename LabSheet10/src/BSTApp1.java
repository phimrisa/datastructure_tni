
public class BSTApp1 {

	public static void main(String[] args) {

		// Example 3: Display sampleTree1()
		BinarySearchTree tree = new BinarySearchTree();

		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);

		// No.3
		System.out.println("\nMinimum Node is " + tree.findMinimum());
		System.out.println("Maximum Node is " + tree.findMaximum());

		// No.5
		System.out.println("Is 15 in BST => " + tree.findSpecificData(15));
		
		// No.7
		int delNode = 60;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent is  " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);
		System.out.println();
		
		tree.delete(delNode);
		tree.printTree(tree.getRoot(), 0);
		
	} 

}