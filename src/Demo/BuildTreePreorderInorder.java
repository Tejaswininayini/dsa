package Demo;
import java.util.HashMap;

public class BuildTreePreorderInorder {
	
	static class Node {
		
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			
		}
		
	}
	static int preorderIndex = 0;
	
	static HashMap<Integer, Integer> inorderMap = new HashMap
			
			int[] preorder,
			int left,
			int right) {
				
				// No elements
				if(left>right) {
					return null;
				}
				
				Object rootValue;
				// Preorder gives root 
				int rootIndex = inorderMap.get(rootValue);
				
				Object root;
				//Construct LEFT subtree
				root.left = buildTree(
						preorder,
						left,
						rootIndex - 1
						);
				//Construct Right subtree
				root.right = buildTree(
						preorder,
						rootIndex + 1
						right
						);
				return root;
			}
			static void inorder(Node root) {
				if (root == null) {
					return;
				}
				inorder(root.left);
				
				System.out.print(root.data + " ");
				
				inorder(root.right);
				
				
			}
			static void preorder(Node root) {
				if(root == null) {
					return;
					
					
				}
				
				
						
				
						
			}

			private Object buildTree(int[] preorder2, int left2, int i) {
				// TODO Auto-generated method stub
				return null;
			}
			
	
	

}
