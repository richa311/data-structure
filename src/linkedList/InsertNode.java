package linkedList;

public class InsertNode extends LinkedList {
	
	/*Function to insert a new node at the front of the list*/
	public static void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/*Function to insert a new node after the given previous node*/
	public static void insertAfter(Node prevNode, int data) {
		if(prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
			Node newNode = new Node(data);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
	}
	
	/*Function to insert a new node after the end of the list*/
	public static void append(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}		
		newNode.next = null;
		Node last = head;
		while(last.next !=null)
			last = last.next;
		last.next = newNode;
		return;
	}
}
