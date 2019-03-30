package linkedList;

public class DeleteNode extends LinkedList{
	
	/*Function to delete any node*/
	public static void delete(int key) {
		Node temp = head, prev = null;
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}
	
	/*Function to delete a node at a given position*/
	public static void deletePos(int pos) {
		if(head == null)
			return;
		Node temp = head;
		if(pos == 0) {
			head = temp.next;
			return;
		}
		for(int i=0; temp != null && i<pos-1; i++) {
			temp = temp.next;
		}
		if(temp == null || temp.next == null)
			return;
		Node next = temp.next.next;
		temp.next = next;
	}
}
