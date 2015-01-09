public class LinkedList<T> {
	private Node head;
	private int size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public void add(T value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}

	public void add(T value, int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("...");
		Node newNode = new Node(value);
		if (index == 0) {
			head = newNode;
			size++;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while (counter < index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = newNode;
		newNode.next = current;
		size++;

	}

	public String toString() {
		String str = "";
		Node current = head;
		str += "[ ";
		while (current != null) {
			str += current.value;
			if (current.next != null)
				str += ", ";
			current = current.next;
		}
		str += " ]";
		return str;
	}

	public void remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("...");
		if (index == 0) {
			head = head.next;
			size--;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while (counter < index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
		size--;

	}

	private class Node<T> {
		public T value;
		public Node next;

		public Node(T value) {
			this.value = value;
			next = null;
		}
	}

}
