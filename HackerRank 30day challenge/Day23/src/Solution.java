import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution {
	
	static void prinLevelOrder(Node root) {
		int h = height(root);
		for (int i = 1; i <= h; i++) {
			printLevel(root, i);
		}
	}

	static int height(Node root) {
		if (root == null)
			return 0;
		else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			
			if (leftHeight > rightHeight)
				return leftHeight + 1;
			else 
				return rightHeight + 1;
		}
	}

	static void printLevel(Node root, int level) {
		if (root == null)
			return;
		
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printLevel(root.left, level - 1);
			printLevel(root.right, level - 1);
		}
	}
	
	static void levelOrder(Node root){
	      Queue<Node> queue = new LinkedList<Node>();
	      queue.add(root);
	      
	      while (!queue.isEmpty()) {
	    	  	Node tempNode = queue.poll();
	    	  	System.out.print(tempNode.data + " ");
	    	  	
	    	  	if (tempNode.left != null)
	    	  		queue.add(tempNode.left);
	    	  	
	    	  	if (tempNode.right != null)
	    	  		queue.add(tempNode.right);
	      }
	      
	    }
	
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            //levelOrder(root);
            prinLevelOrder(root);
        }	
}