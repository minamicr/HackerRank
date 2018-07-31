
import java.util.*;
import java.io.*;

class Node{
	    Node left,right;
	    int data;
	    
	    Node(int data){
	        this.data=data;
	        left=right=null;
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

	    private static int getHeight(Node node){
	    	printTree(node);
	    	return heightTree - 1;
	    }
	    
	    private static int heightTree = 0;
	    
	    private static void printTree(Node node){
	    	boolean sumLevel = true;
	    	while (node != null){
	    		System.out.println(node.data);
	    		node.data = -node.data;
	    		
	    		if (node.left != null && node.right != null){
	    			heightTree ++;
	    		}
	    		
	    		if (node.left != null && node.right == null){
	    			heightTree ++;
	    		}

	    		if (node.right != null && node.left == null){
	    			heightTree ++;
	    		}
	    		
	    		if (node.left != null && node.left.data > 0) {
	    			printTree(node.left);
	    		}
	    		
	    		if (node.right != null && node.right.data > 0) {
	    			printTree(node.right);
	    		}
	    		
	    		
	    		if (node.data < 0) {
	    			node.data = -node.data;
	    			break;
	    		}
	    	} 
	    	//System.out.println("saiu do while " + node.data);
	    }
	    
	    public static void main(String args[]){
	    	Scanner sc = new Scanner(System.in);
	        int T=sc.nextInt();
	        Node root=null;
	        while(T-->0){
	            int data=sc.nextInt();
	            root=insert(root,data);
	        }
	        
	        System.out.println("heightTree = " + getHeight(root));
	        //int height=getHeight(root);
	        //System.out.println(height);
	    }
	
}
