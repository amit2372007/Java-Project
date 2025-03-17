class LL {
	private int size;
	LL() {
    this.size = 0;
	}
    Node head;
    class Node {
		String data;
		Node next;
		Node (String data) {
        this.data = data;
		this.next = null;
		size++;
		}
	}
	public void addFirst(String data) {
    Node newNode = new Node(data);
	if (head == null) {
		head = newNode;
		return;
	}
	newNode.next = head;
	head = newNode;
	}
	public void addLast(String data) {
		Node newnNode = new Node(data);
		if (head == null) {
			head = newnNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newnNode;
	}
	public void printList() {
		
		if (head == null) {
			System.out.print("NO ELEMENT");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
        System.out.print(currNode.data + "-->");
		currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	public void deleteFirst() {
		if (head == null) {
			System.out.println("There is no Element");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		head.next = head;
	}
	public void deleteLast() {
		if (head == null) {
			System.out.println("There is no Element");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}

		Node secondLast = head;
		Node Last = head.next;
		while (Last.next != null) {
             Last = Last.next;
			 secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	public void printSize() {
    System.out.println("Size : " + size);
	}

	public static void main (String args[]) {
    LL list = new LL();
	list.addFirst("This");
	list.addLast("is");
	list.addLast("a");
	list.addLast("List");
	list.deleteLast();
	list.printList();
	list.printSize();

	}
}