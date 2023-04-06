

public class LinkedList {

	private Node head;
	private Node tail;
	
	public void add(String item) {
		
		Node newItem = new Node(item);
		
		// handles the case where the new item 
		// is the only thing in the list
		if (head == null) {
			head = newItem;
			tail = newItem;
			return;
		}
		
		tail.next = newItem;
		tail = newItem;
	}
	
	
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.item);
			current = current.next;
		}
	}
	
	
	public void printWithSkips() {
		Node current = head;
		int count = 0;
			while (current != null){ // making sure going until tail
				System.out.println(current.item); // print item
				count = count +1; // increase count
				for(int i=0; i<count-1 ; i++){
					if(current.next != null) {
						current = current.next;
					}
				
				}
				current = current.next;


		}
	}

	
	class Node {
		String item;
		Node next;
		
		public Node(String item) {
			this.item = item;
			this.next = null;
		}
	}
}
