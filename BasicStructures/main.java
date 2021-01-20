package BasicStructures;

public class main {
  public static void main(String args[]) {

    BinarySearchTree tree = new BinarySearchTree();

    tree.Insert(3);
    tree.Insert(2);
    tree.Insert(6);
    tree.Insert(9);
    tree.Insert(1);
    tree.Insert(7);

    tree.Print();

    tree.Delete(4);
    tree.Delete(3);

    tree.Print();
  }
}
