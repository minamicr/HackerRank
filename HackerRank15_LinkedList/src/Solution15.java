import java.io.*;
import java.util.*;

class Solution15 {

    public static Node insert(Node head,int data) {
        //Complete this method
    	Node newNode = new Node(data);
    	
    	if (head == null){
    		return newNode;
    	} else {
    		Node headNode = head;
	    	while (head.next != null){
	        	head = head.next;
	        }
	        head.next = newNode;
	        return headNode;
    	}
     }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}
