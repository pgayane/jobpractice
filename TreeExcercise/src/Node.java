
public class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int v, Node l, Node r){
		this.value = v;
		this.left = l;
		this.right = r;
	}
	
	public static void print(Node root){
		if (root != null)
		{
			// in-order traversal
			print(root.left);
			System.out.println(root.value);
			print(root.right);
		}
		
	}
	
	public static boolean isBST(Node root){
		if (root == null)
			return true;
		// post-order traversal
		boolean isLeft = isBST(root.left);
		boolean isRight = isBST(root.right);
		
		if ( isLeft && isRight &&
			(root.left == null || root.left.value <= root.value) &&
			(root.right == null || root.right.value >= root.value))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		Node root = new Node(10, new Node(3, new Node(1, null, null),
											new Node(5, null, null)), 
								new Node(23, new Node(15, null, null), 
											null));
		
		Node.print(root);
		
		System.out.println(Node.isBST(root));
	}
}
