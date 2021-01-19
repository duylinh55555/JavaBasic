import java.util.Stack;

public class BinarySearchTree {
   public Node root;

   BinarySearchTree() {
      root = null;
   }

   public boolean IsEmpty() {
      if (root == null)
         return true;
      else
         return false;
   }

   public void Insert(int index) {
      Node currentNode = root;
      Node parentCurrentNode = null;
      boolean isLeftNode = true; // left = true, right = false

      while (currentNode != null) {
         parentCurrentNode = currentNode;

         if (index < currentNode.data) {
            currentNode = currentNode.leftNode;
            isLeftNode = true;
         } else {
            currentNode = currentNode.rightNode;
            isLeftNode = false;
         }
      }

      Node node = new Node(index);

      if (parentCurrentNode == null)
         root = node;
      else if (isLeftNode)
         parentCurrentNode.leftNode = node;
      else
         parentCurrentNode.rightNode = node;
   }

   public void Delete(int index) {
      Node currentNode = root;
      Node parentNode = null;

      while (currentNode != null && currentNode.data != index) {
         parentNode = currentNode;

         if (index < currentNode.data)
            currentNode = currentNode.leftNode;
         else
            currentNode = currentNode.rightNode;
      }

      if (currentNode == null)
         System.out.println("Value not found");
      else {
         if (currentNode.leftNode == null || currentNode.rightNode == null) {
            Node node;

            if (currentNode.leftNode == null)
               node = currentNode.rightNode;
            else
               node = currentNode.leftNode;

            if (parentNode == null)
               return;

            if (currentNode == parentNode.leftNode)
               parentNode.leftNode = node;
            else
               parentNode.rightNode = node;
         } else {
            Node pNode = null;
            Node tempNode = currentNode.rightNode;

            while (tempNode.leftNode != null) {
               pNode = tempNode;
               tempNode = tempNode.leftNode;
            }

            if (pNode != null)
               pNode.leftNode = tempNode.rightNode;
            else
               currentNode.rightNode = tempNode.rightNode;

            currentNode.data = tempNode.data;
         }
      }
   }

   public void Print() {
      Stack<Node> stack = new Stack<>();
      Node currentNode = null;

      if (root != null) {
         currentNode = root.leftNode;
         stack.push(root);
      }

      while (stack.empty() == false) {
         while (currentNode != null) {
            stack.push(currentNode);
            currentNode = currentNode.leftNode;
         }

         Node topNode = stack.pop();
         System.out.print(topNode.data + ", ");

         currentNode = topNode.rightNode;
      }
   }
}
