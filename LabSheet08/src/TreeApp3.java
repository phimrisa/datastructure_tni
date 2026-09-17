
public class TreeApp3 {

	public static void main(String[] args) {

		/*
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);

		
		System.out.println();
		tree.searchDeleteNode(2);
		System.out.println(tree.getDeleteNode().data);
		System.out.println(tree.getParent().data);

		System.out.println("-----------------------------------");
		
		int target = 17;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		*/
		
		// Practice No.5
		
		// Binary Tree 5
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("-------------------------------");
		BinaryTree tree5 = new BinaryTree();
		tree5.createTree5();
		tree5.printTree(tree5.getRoot(), 0);
		
		// Delete leaf node.
		System.out.println("-------------------------");
		System.out.println("Delete leaf node. --> 25");
		System.out.println("-------------------------");
		tree5.delete(25);
		tree5.printTree(tree5.getRoot(), 0);
		
		// Delete a node with only 1 child.
		System.out.println("----------------------------------------");
		System.out.println("Delete a node with only 1 child. --> 40");
		System.out.println("----------------------------------------");
		tree5.delete(40);
		tree5.printTree(tree5.getRoot(), 0);
		
		// Delete a node with only 2 children.
		System.out.println("-------------------------------------------");
		System.out.println("Delete a node with only 2 children. --> 60");
		System.out.println("-------------------------------------------");
		tree5.delete(60);
		tree5.printTree(tree5.getRoot(), 0);

	}

}
