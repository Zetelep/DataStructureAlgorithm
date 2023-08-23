package DataStructures.Trees;

public class BinarySearchTree {
    Node root;
    public  void insert(Node node){
        root = insertHelper(root,node);
    }
    private Node insertHelper(Node root, Node node){
        int data =node.data;
        if (root == null) {
            root = node ;
            return root;
        }
        else if (data< root.data) {
            root.left = insertHelper(root.left,node);
        }
        else if (data> root.data) {
            root.right = insertHelper(root.right,node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    public boolean search(int data){
        return searchHelper(root,data);
    }
    private boolean searchHelper (Node root, int data){

        return false;
    }
    public Node removeHelper(Node root, int data){
        return null;
    }
    private int successor(Node root){return -1;}
    private int predecessor(Node root){return -1;}

}
