package BasicStructures;

public class Stack extends LinkedList {
	protected void EmptyNotification() {
		System.out.println("Stack is empty");
	}

	public void Push(Node node) {
		AddHead(node);
	}

	public Node Top() {
		if (IsEmpty())
			EmptyNotification();
		return head;
	}

	public Node Pop() {
		Node node = head;
		DeleteHead();
		return node;
	}
}