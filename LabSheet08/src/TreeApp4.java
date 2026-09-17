import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BinaryTree tree6 = new BinaryTree();
		
		tree6.createTree6();
		tree6.printTree(tree6.getRoot(), 0);
		
		System.out.println();
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		Node found = findNode(tree6.getRoot(), number);
		
		if (found == null) {
			
			System.out.println("Cannot found Node(data=[" + number + "])");
			//break;
			
		} else {
			
			if (found.left != null) {
				
				System.out.println("Left Child = " + found.left.data);
				
			} else {
				
				System.out.println("No Left Child");
				
			}
			
			if (found.right != null) {
				
				System.out.println("Right Child = " + found.right.data);
				
			} else {
				
				System.out.println("No Right Child");
				
			}
			
			if (found.left == null && found.right == null) {
				
				System.out.println("[" + number  + "] is Leaf Node");
				
			} else {
				
				System.out.println("[" + number  + "] is not Leaf Node");
			}
			
		} // End of else
		
		scanner.close();

	}
	
	public static Node findNode(Node node, int target) {
		
		if (node == null) {
			
			return null;
			
		}
		
		if (node.data == target) {
			
			return node;
			
		}
		
		Node result = findNode(node.left, target);
		
		if (result != null) {
			
			return result;
			
		}
		
		return findNode(node.right, target);
		
	}

}
