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
        tree.remove(0);//0 doesn't exist!
        tree.remove(3);
        tree.display(); //1 2 7 8

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.root = new Node(27);
        tree2.root.left = new Node(12);
        tree2.root.right = new Node(3);
        tree2.root.left.left = new Node(44);
        tree2.root.left.right = new Node(17);
        tree2.root.right.left = new Node(56);

        tree2.traversal_inorder(tree2.root); //44 12 17 27 56 3
        System.out.println();
        tree.traversal_preorder(tree2.root); //27 12 44 17 3 56
        System.out.println();
        tree.traversal_postorder(tree2.root); //44 17 12 56 3 27

    }
}
