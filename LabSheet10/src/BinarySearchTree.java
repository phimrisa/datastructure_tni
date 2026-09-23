
public class BinarySearchTree {

	private Node root;
	private Node parent;
	private Node deleteNode;

	public boolean isEmpty() {
		return root == null;
	}

	public void sampleTree1() {
		int[] nums = { 20, 10, 60, 7, 11, 30, 65, 3, 40 };

		for (int num : nums) {
			insert(num);
		}
	}

	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}

	public Node getRoot() {
		return root;
	}

	public Node getParent() {
		return parent;
	}

	public Node getDeleteNode() {
		return deleteNode;
	}

	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;
			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				} else if (new_data > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right;
				}

			} // end while
		} // end if
	}

	//////////////////////////////////////////////////////////////////

	// No.1
	public int findMinimum() {

		// IF TREE IS EMPTY THEN RETURN NULL
		if (isEmpty()) {

			return -1;

		}

		// SET current_node STARTS AT ROOT NODE
		Node current_node = root;

		// IF THE LEFT SUBTREE IS EMPTY THEN RETURN ROOT NODE
		if (root.left == null) {

			return root.data;

		}

		// ELSE
		else {

			// LOOP:
			while (current_node.left != null) {

				// MOVE current_node TO THE LEFT
				current_node = current_node.left;

				// IF THE LEFT OF current_node IS NULL THEN RETURN current_node
				if (current_node.left == null) {

					return current_node.data;

				}

			} // END LOOP

			return -1;

		} // END IF

	} // End of findMinimum()

	public int findMinimum(Node root) {

		// IF TREE IS EMPTY THEN RETURN NULL
		if (isEmpty()) {

			return -1;

		}

		// SET current_node STARTS AT ROOT NODE
		Node current_node = root;

		// IF THE LEFT SUBTREE IS EMPTY THEN RETURN ROOT NODE
		if (root.left == null) {

			return root.data;

		}

		// ELSE
		else {

			// LOOP:
			while (current_node.left != null) {

				// MOVE current_node TO THE LEFT
				current_node = current_node.left;

				// IF THE LEFT OF current_node IS NULL THEN RETURN current_node
				if (current_node.left == null) {

					return current_node.data;

				}

			} // END LOOP

			return -1;

		} // END IF

	} // End of findMinimum()

	// No.2
	public int findMaximum() {

		// IF TREE IS EMPTY THEN RETURN NULL
		if (isEmpty()) {

			return -1;

		}

		// SET current_node STARTS AT ROOT NODE
		Node current_node = root;

		// IF THE LEFT SUBTREE IS EMPTY THEN RETURN ROOT NODE
		if (root.right == null) {

			return root.data;

		}

		// ELSE
		else {

			// LOOP:
			while (current_node.right != null) {

				// MOVE current_node TO THE RIGHT
				current_node = current_node.right;

				// IF THE RIGHT OF current_node IS NULL THEN RETURN current_node
				if (current_node.right == null) {

					return current_node.data;

				}

			} // END LOOP

			return -1;

		} // END IF

	} // End of findMaximum()

	public int findMaximum(Node root) {

		// IF TREE IS EMPTY THEN RETURN NULL
		if (isEmpty()) {

			return -1;

		}

		// SET current_node STARTS AT ROOT NODE
		Node current_node = root;

		// IF THE LEFT SUBTREE IS EMPTY THEN RETURN ROOT NODE
		if (root.right == null) {

			return root.data;

		}

		// ELSE
		else {

			// LOOP:
			while (current_node.right != null) {

				// MOVE current_node TO THE RIGHT
				current_node = current_node.right;

				// IF RIGHT OF current_node IS NULL THEN RETURN current_node
				if (current_node.right == null) {

					return current_node.data;

				}

			}

			return -1;

		}

	} // End of findMaximum()

	// No.4
	public boolean findSpecificData(int target) {

		if (isEmpty()) {

			return false;

		}

		Node current_node = root;

		if (target == current_node.data) {

			return true;

		} else {

			while (current_node != null) {

				if (target == current_node.data) {

					return true;

				}

				if (target > current_node.data) {

					current_node = current_node.right;

				} else {

					current_node = current_node.left;

				}

			}

		}

		return false;

	} // End of findSpecificData()

	// No.6
	public void searchDeleteNode(int target) {

		parent = root;
		Node current_node = root;

		while (current_node != null) {

			// IF target EQUALS TO current_node.data THEN
			if (target == current_node.data) {

				// SET deleteNode AS current_node AND STOP LOOP
				deleteNode = current_node;
				break;

			}

			// SET parent AS current_node
			parent = current_node;

			if (target < current_node.data) {

				current_node = current_node.left;

			} else {

				current_node = current_node.right;

			}

		}

	} // End of searchDeleteNode()

	// No.8
	public void delete(int target) {

		// Call searchDeleteNode() to find Parent and deleteNode.
		searchDeleteNode(target);

		// Case extra: Unable to delete anything.
		if (isEmpty()) {

			System.out.println("Empty Tree");

		} else if (deleteNode == null) {

			System.out.println("Cannot found th delete node");

		} else {

			// Case 1: Delete Leaf Node
			if (deleteNode.left == null && deleteNode.right == null) {

				if (deleteNode.data < parent.data) {

					parent.left = null;

				} else {

					parent.right = null;

				}

			} // End of Case 1

			// Case 2: Delete Node with Two Children
			else if (deleteNode.left != null && deleteNode.right != null) {

				// deleteByLeftSubtree();
				deleteByRightSubtree();

			} // End of Case 2

			// Case 3: Delete Node with 1 Child
			else {

				// Only have left child (subtree).
				if (deleteNode.left != null) {

					if (deleteNode.data < parent.data) {

						parent.left = deleteNode.left;

					} else {

						parent.right = deleteNode.left;

					}

				}

				// Only have right child (subtree).
				else {

					if (deleteNode.data < parent.data) {

						parent.left = deleteNode.right;

					} else {

						parent.right = deleteNode.right;

					}

				}

			} // End of Case 3

		}

	} // End of delete()

	public void deleteByLeftSubtree() {

		// SET targetNode AS deleteNode
		Node targetNode = deleteNode;

		// SET maxValue WITH THE MAXIMUM NODE IN LEFT SUBTREE
		int maxValue = findMaximum(deleteNode.left);

		// DELETE THE MAXIMUM NODE IN THE LEFT SUBTREE
		delete(maxValue);

		// UPDATE targetNode.data EQUALS TO maxValue
		targetNode.data = maxValue;

	} // End of deleteByLeftSubtree()

	public void deleteByRightSubtree() {

		// SET targetNode AS deleteNode
		Node targetNode = deleteNode;

		// SET maxValue WITH THE MINIMUM NODE IN RIGHT SUBTREE
		int maxValue = findMinimum(deleteNode.right);

		// DELETE THE MINIMUM NODE IN THE RIGHT SUBTREE
		delete(maxValue);

		// UPDATE targetNode.data EQUALS TO maxValue
		targetNode.data = maxValue;

	} // End of deleteByRightSubtree()

} // End of BinarySearchTree