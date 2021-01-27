package BasicStructures;

public class Queue extends LinkedList {
   @Override
   protected void EmptyNotification() {
      System.out.println("Queue is empty");
   }

   public void Enqueue(Node node) {
      AddHead(node);
   }

   public Node Dequeue() {
      Node node = tail;
      DeleteTail();

      return node;
   }

   public Node Front() {
      if (IsEmpty())
         EmptyNotification();
      return tail;
   }
}
