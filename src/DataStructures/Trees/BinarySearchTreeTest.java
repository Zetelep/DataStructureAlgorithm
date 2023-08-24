package DataStructures.Trees;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(8));
        tree.insert(new Node(2));
        tree.insert(new Node(3));
        tree.insert(new Node(7));
        tree.insert(new Node(1));
        tree.display(); //1 2 3 7 8
        System.out.println(tree.search(1)); //true
        System.out.println(tree.search(0)); //false
    }
}
