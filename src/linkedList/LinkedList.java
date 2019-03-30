package linkedList;

public class LinkedList {

	public static Node head;	
	public static class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}			
	}

	public static void main(String[] args) {
		head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;

		printList();
	}

	public static void printList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}
