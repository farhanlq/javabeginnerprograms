package code;

public class StackLinkedList {

	private Node head;

	private class Node {
		int value;
		Node next;
	}

	public StackLinkedList() {
		this.head = null;
	}

	public int pop() throws LinkedListEmptyException {
		if (head == null) {
			throw new LinkedListEmptyException();
		}
		int value = head.value;
		head = head.next;
		return value;
	}

	public void push(int value) {
		Node node = head;
		head = new Node();
		head.value = value;
		head.next = node;

	}

	public static void main(String[] args) {
		StackLinkedList sll = new StackLinkedList();
		sll.push(34);
		sll.push(12);
		sll.push(28);
		sll.push(10);
		sll.push(38);
		System.out.println("Element removed from LinkedList: " + sll.pop());
		System.out.println("Element removed from LinkedList: " + sll.pop());
	}
}

class LinkedListEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LinkedListEmptyException() {
		super();
	}

	public LinkedListEmptyException(String message) {
		super(message);
	}

}
