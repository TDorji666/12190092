public class LinkedList{
	Node head;
	Node tail;
	int size;

	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	//size
	public int size(){
		return size;
	}
	//check if it is empty
	public boolean isEmpty(){
		if (size == 0) {
			return true;
		}
		return false;
	}
	//returns the first node 
	public int first(){
		return head.getElement();
	}
	//return the last node
	public int last(){
		return tail.getElement();
	}

	//add first node
	public void addFirst(int n){
		Node newest = new Node(n, null);

		if (size == 0) {
			 head = newest;
			 tail = newest;
		}

		else{
			newest.setNext(head);
			head = newest;
		}
		size = size + 1;
	}

	// add last node
	public void addLast(int n){
		Node newest = new Node(n, null);
		if (size == 0) {
			head = newest;
			tail = newest;
		}
		else{
			tail.setNext(newest);
			tail =newest;
		}
		size += 1;
	}

	// remove node
	public int removeFirst(){
		int deletedElement = head.getElement();
		if (size == 0) {
			return 0;
		}
		else{
			head = head.getNext();
			size = size -1;
		}
		return deletedElement;
	}



}

class Node{
	private int element;
	private Node next;
	// constructor
	public Node(int element, Node next ){
	    this.element = element;
		this.next = next;
	}

	// getElement
	public int getElement(){
		return element;
	}

	// getNext()
	public Node getNext(){
		return next;
	}

	// setElement()
	public void setElement(int n){
		element = n;
	}

	// setNext()
	public void setNext(Node n){
		next = n;
	}
}