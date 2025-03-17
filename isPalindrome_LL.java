class LL {
    Node head;
    class Node {
		int data;
		Node next;
		Node (int data) {
        this.data = data;
		this.next = null;
		}
	}
	public void addFirst(int data) {
    Node newNode = new Node(data);
	if (head == null) {
		head = newNode;
		return;
	}
	newNode.next = head;
	head = newNode;
	}
	public void addLast(int data) {
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
	public void removeNthfromEnd(int n) {
		if (head.next == null) {
			head = null;
			return;
		}
		int size = 0;
		Node currNode = head;
		while (currNode != null) {
			size++;
			currNode = currNode.next;
		}
		int indexfromstarting = size - n;
		Node prevNode = head;
		int i = 1;
		while (i < indexfromstarting) {
			prevNode = prevNode.next;
			i++;
		}
		prevNode.next = prevNode.next.next;
	}
	public Node reverseList(Node head) {
		Node prevNode = null;
		Node currNode = head;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			prevNode = currNode;
			currNode = nextNode;
		}
		return prevNode;
	}
	public Node findmiddle(Node head) {
      Node hare = head;
	  Node turtle = head;
	  while (hare.next != null && hare.next.next != null) {
		hare = hare.next.next;
		turtle = turtle.next;
	  }
	  return turtle;
	}
	public boolean isPalindrome () {
		if (head == null || head.next == null) {
			return true;
		}
		Node middle = findmiddle(head);
		Node secondHalfStarting = reverseList(middle.next);

		Node firstHalfStarting = head;
		while (secondHalfStarting != null) {
			if (firstHalfStarting.data != secondHalfStarting.data) {
				return false;
			}
			firstHalfStarting = firstHalfStarting.next;
			secondHalfStarting = secondHalfStarting.next;   } 
			return true;  }
		public static void main (String args[]) {
    LL list = new LL();
	list.addFirst(1);
	list.addLast(2);
	list.addLast(2);
	list.addLast(1);
	
    System.out.println(list.isPalindrome());
	
	}
}