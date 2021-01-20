package BasicStructures;

public class LinkedList {
	public Node head;
	public Node tail;

	LinkedList() {
		head = null;
		tail = null;
	}

	private void CreateNew(Node node) {
		head = node;
		tail = head;
	}

	public boolean IsEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	protected void EmptyNotification() {
		System.out.println("LinkedList is empty");
	}

	public void AddHead(Node node) {
		if (IsEmpty())
			CreateNew(node);
		else {
			node.rightNode = head;
			head.leftNode = node;
			head = node;
		}
	}

	public void AddTail(Node node) {
		if (IsEmpty())
			CreateNew(node);
		else {
			node.leftNode = tail;
			tail.rightNode = node;
			tail = node;
		}
	}

	public void Insert(Node node, int position) {
		if (IsEmpty()) {
			System.out.print("Linked list is empty. Inserted on head");
			AddHead(node);
		} else {
			Node currentNode = head;
			for (int i = 0; i < position - 1; i++)
				currentNode = currentNode.rightNode;

			node.leftNode = currentNode;
			node.rightNode = currentNode.rightNode;

			currentNode.rightNode = node;
			node.rightNode.leftNode = node;
		}
	}

	public void DeleteHead() {
		if (IsEmpty())
			EmptyNotification();
		else {
			head = head.rightNode;
			head.leftNode = null;
		}
	}

	public void DeleteTail() {
		if (IsEmpty())
			EmptyNotification();
		else {
			tail = tail.leftNode;
			tail.rightNode = null;
		}
	}

	public void Print() {
		if (IsEmpty())
			EmptyNotification();
		else {
			for (Node currentNode = head; currentNode != null; currentNode = currentNode.rightNode) {
				System.err.println(currentNode.data);
			}
		}
	}
}