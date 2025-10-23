package Tree.BinarySearchTree;

import java.util.Scanner;

class BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // Insert node automatically as BST
    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        } else {
            System.out.println("Duplicate value! Ignored.");
        }
        return root;
    }

    // Search in BST
    public boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (key == root.data)
            return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Traversals
    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Find minimum value node (used in deletion)
    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete node in BST
    public Node delete(Node root, int key) {
        if (root == null) {
            System.out.println("Value not found!");
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found
            if (root.left == null && root.right == null) { // Case 1: No child
                return null;
            } else if (root.left == null) { // Case 2: One child
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else { // Case 3: Two children
                Node successor = findMin(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== BST Operations =====");
            System.out.println("1. Create Tree");
            System.out.println("2. Insert Node");
            System.out.println("3. Search Node");
            System.out.println("4. Delete Node");
            System.out.println("5. Traversals");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter root value: ");
                    int rootVal = sc.nextInt();
                    bst.root = new Node(rootVal);
                    System.out.println("Root created with value " + rootVal);
                }
                case 2 -> {
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    bst.root = bst.insert(bst.root, val);
                    System.out.println("Inserted " + val);
                }
                case 3 -> {
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    boolean found = bst.search(bst.root, key);
                    System.out.println(found ? "Found ✅" : "Not Found ❌");
                }
                case 4 -> {
                    System.out.print("Enter value to delete: ");
                    int key = sc.nextInt();
                    bst.root = bst.delete(bst.root, key);
                    System.out.println("Deleted " + key + " if it existed.");
                }
                case 5 -> {
                    System.out.print("Inorder: ");
                    bst.inorder(bst.root);
                    System.out.println();
                    System.out.print("Preorder: ");
                    bst.preorder(bst.root);
                    System.out.println();
                    System.out.print("Postorder: ");
                    bst.postorder(bst.root);
                    System.out.println();
                }
                case 6 -> System.out.println("Exiting... 👋");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
