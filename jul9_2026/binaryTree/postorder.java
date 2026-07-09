package jul9_2026.binaryTree;
//tis the postorder traversal of binary tree.. 
public class postorder {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    static void postorderTraversal(Node root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("Postorder Traversal: ");
        postorderTraversal(root);
    }
}