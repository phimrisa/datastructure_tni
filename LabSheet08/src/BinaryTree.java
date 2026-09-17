import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

	private Node root;
	private Node parent; // delete_node's parent.
	private Node delete_node;

	public BinaryTree() {
		
		root = null;
		
	}
	
	public Node getRoot() {
		
		return root;
		
	}
	
	public Node getParent() {
		
		return parent;
		
	}
	
	public Node getDeleteNode() {
		
		return delete_node;
		
	}

	public void printTree(Node node, int depth) {
		
		if (node != null) {
			
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
			
		}
		
	}
	
	public void createTree1() {
		
		root = new Node(1); // Create new node as the root.
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

	}
	
	public void createTree2() {
		
		root = new Node(15);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(11);
		root.left.left.left = new Node(2);
		root.right = new Node(23);
		root.right.left = new Node(19);
		root.right.left.right = new Node(20);

	}
	
	public void createTree3() {
		
		root = new Node(50);
		root.left = new Node(10);
		root.left.left = new Node(11);
		root.left.right = new Node(12);
		root.right = new Node(22);
		root.right.right = new Node(24);
		root.right.right.left = new Node(23);

	}
	
	public void createTree4() {
		
		int[] nums = {10, 8, 15, 2, 9, 18, 14, 20, 11, 17};
		
		for (int nums_ : nums) {
			
			insert(nums_);
			
		}
		
	}
	
	public void createTree5() {
		
		int[] nums = {50, 30, 10, 20, 25, 40, 45, 70, 60, 55, 65};
		
		for (int nums_ : nums) {
			
			insert(nums_);
			
		}
		
	}
	
	public void createTree6() {
		
		int[] nums = {40, 20, 30, 25, 35, 32, 70, 55, 85, 80};
		
		for (int nums_ : nums) {
			
			insert(nums_);
			
		}
		
	}
	
	
	public void insert(int new_data) {
		
		/*
			 1. Check if the tree is empty ➔ if root is empty, 
			 insert new_data directly as the root node.
		*/

		if (root == null) {
			
			root = new Node(new_data);
			
		} // End of if().
		
		/* 
			 2. If the tree is not empty, create a pointer current starting at root.
		*/
		
		else {
			
			Node current_node = root;
			
		/*
			3. Loop continuously, comparing new_data with the data at current.
		*/
			
			while (true) { // Use "while (true) {}" if you dont't known the condition yet.
				
			/*
				4. If new_data is less than current’s data ➔ check the left child. 
				If it is NULL, insert new_data there and stop; 
				otherwise move current to the left.
			*/
				
				if (new_data < current_node.data) {
					
					if (current_node.left == null) {
						
						current_node.left = new Node(new_data); 
						break;
						
					} // End of if().
					
					current_node = current_node.left;

				} // End of if().
				
			/*
				5. If new_data is greater than current’s data ➔ check the right child. 
				If it is NULL, insert new_data there and stop; 
				otherwise move current to the right. 
			*/
				
				else {
						
					if (current_node.right == null) {
							
						current_node.right = new Node(new_data); 
						break;
						
					} // End of if().

					current_node = current_node.right;
					
				} // End of else().
				
			} // End of while().
			
		} // End of else().
			
	} // End of insert().
	
	public void searchDeleteNode(int target) {
		
		Queue<Node> queue = new ArrayDeque<Node>();
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			int level_size = queue.size();
			Node current_node = queue.poll();
			
			parent = current_node;
			
			if (parent.data == target) {
				
				delete_node = parent;
				break;
				
			} // End of if().
			
			for (int i = 0; i < level_size; i++) {
				
				if (current_node.left != null) {
					
					if (current_node.left.data == target) {
						
						delete_node = current_node.left;
						queue.clear();
						break;
						
					} // End of if().
					
					queue.add(current_node.left);
					
				} // End of if().
				
				
				if (current_node.right != null) {
					
					if (current_node.right.data == target) {
						
						delete_node = current_node.right;
						queue.clear();
						break;
						
					} // End of if().
					
					queue.add(current_node.right);
					
				} // End of if().
				
				
				
			} // End of for().
			
		} // End of while().
		
	} // End of searchDeleteNode().
	
	public void delete(int target) {
		
		searchDeleteNode(target);
		
		if (root == null) {
			
			System.out.println("Empty Tree.");
			
		} // End of if().
		
		else if (delete_node == null) {
			
			System.out.println("Cannot found the delete node.");
			
		} // End of else if().
		
		else {
			
			// Case 1: delete leaf node.
			if (delete_node.left == null && delete_node.right == null) {
				
				if (parent.left != null && parent.left.data == target) {
					
					parent.left = null;
					
				} // End of if().
				
				else {
					
					parent.right = null;
					
				} // End of else()
				
			} // End of Case 1.
			
			// Case 2: delete a node with only 2 children.
			else if (delete_node.left != null && delete_node.right != null) {
				
				Node successor_parent = delete_node;
				Node successor = delete_node.right; // Focus on right-subtree.
				
				while (successor.left != null) { // Find the left-leaf node.
					
					successor_parent = successor;
					successor = successor.left;
					
				} // End of while()
				
				delete_node.data = successor.data;
				
				if (successor_parent.left == successor) {
					
					successor_parent.left = successor.right;
					
				} // End of if()
				
				else {
					
					successor_parent.right = successor.right;
					
				} // End of else()
				
			} // End of Case 2.
			
			// Case 3: delete a node with only 1 child.
			else {
				
				if (delete_node.left != null) { // Has a left child.
					
					if (parent.left != null && parent.left.data == delete_node.data) {
						
						parent.left = delete_node.left;
						
					} // End of if()
					
					else {
						
						parent.right = delete_node.left;
						
					} // End of else()
					
				} // End of if()
				
				else {
					
					if (parent.left != null && parent.left.data == delete_node.data) {
						
						parent.left = delete_node.right;
						
					} // End of if()
					
					else {
						
						parent.right = delete_node.right;
					
				} // End of else()
				
			} // End of Case 3.
			
		} // End of else()
		
	} 
	} // End of delete()
} // End of BinaryTree.
	
