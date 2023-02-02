import java.util.*;
import java.io.*;

class Node {
	int data;
	Node next;
}

class Link {
	Node head;
	public void in(int val){
		Node node = new Node();
		node.data = val;
		node.next = null;

		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
				n = n.next;
			n.next = node;
		}
	}

	public void dis()
	{
		Node n = head;
		while(n.next != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

}

class Sample{
	final public static void main(String args[]) {

		Link node = new Link();
		node.in(6);
		node.in(7);
		node.in(8);

		node.dis();

		
	}
}
