package Tree.BinaryTree;

import java.util.*;

public class BinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;
    Scanner sc = new Scanner(System.in);

    // Create root node
    public void createTree() {
        System.out.print("Enter root node value: ");
        int value = sc.nextInt();
        root = new Node(value);
        System.out.println("Root created with value " + value);
    }

    // Insert a node manually
    public void insertNode() {
        if (root == null) {
            System.out.println("Tree is empty. Create root first.");
            return;
        }

        System.out.print("Enter parent node value: ");
        int parentValue = sc.nextInt();

        Node parent = findNode(root, parentValue);
        if (parent == null) {
            System.out.println("Parent not found!");
            return;
        }

        System.out.print("Enter value to insert: ");
        int data = sc.nextInt();
        System.out.print("Insert to left (L) or right (R)? ");
        char dir = sc.next().charAt(0);

        Node newNode = new Node(data);

        if (dir == 'L' || dir == 'l') {
            if (parent.left == null) {
                parent.left = newNode;
                System.out.println("Inserted " + data + " to the LEFT of " + parentValue);
            } else {
                System.out.println("Left child already exists!");
            }
        } else if (dir == 'R' || dir == 'r') {
            if (parent.right == null) {
                parent.right = newNode;
                System.out.println("Inserted " + data + " to the RIGHT of " + parentValue);
            } else {
                System.out.println("Right child already exists!");
            }
        } else {
            System.out.println("Invalid direction! Use L or R.");
        }
    }

    // Find a node (used for insert)
    public Node findNode(Node root, int value) {
        if (root == null)
            return null;
        if (root.data == value)
            return root;
        Node left = findNode(root.left, value);
        if (left != null)
            return left;
        return findNode(root.right, value);
    }

    // Search for element
    public boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        return search(root.left, key) || search(root.right, key);
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

    // Helper to find deepest node
    private Node getDeepestRightmostNode(Node root) {
        if (root == null)
            return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        return temp;
    }

    // Delete node by value
    public void delete(Node root, int key) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.data == key) {
                this.root = null;
                System.out.println("Deleted the only node in the tree.");
            }
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp = null, keyNode = null;

        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp.data == key)
                keyNode = temp;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }

        if (keyNode != null) {
            Node deepest = getDeepestRightmostNode(root);
            int x = deepest.data;
            deleteDeepest(root, deepest);
            keyNode.data = x;
            System.out.println("Deleted node with value " + key);
        } else {
            System.out.println("Node not found!");
        }
    }

    // Delete deepest node
    private void deleteDeepest(Node root, Node delNode) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp;
        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else
                    q.add(temp.left);
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else
                    q.add(temp.right);
            }
        }
    }

    // MENU
    public void menu() {
        int choice;
        do {
            System.out.println("\n===== Binary Tree Operations =====");
            System.out.println("1. Create Tree");
            System.out.println("2. Insert Node");
            System.out.println("3. Search Node");
            System.out.println("4. Delete Node");
            System.out.println("5. Inorder Traversal");
            System.out.println("6. Preorder Traversal");
            System.out.println("7. Postorder Traversal");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> createTree();
                case 2 -> insertNode();
                case 3 -> {
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();
                    System.out.println(search(root, key) ? "Found ✅" : "Not Found ❌");
                }
                case 4 -> {
                    System.out.print("Enter value to delete: ");
                    int key = sc.nextInt();
                    delete(root, key);
                }
                case 5 -> {
                    System.out.print("Inorder: ");
                    inorder(root);
                    System.out.println();
                }
                case 6 -> {
                    System.out.print("Preorder: ");
                    preorder(root);
                    System.out.println();
                }
                case 7 -> {
                    System.out.print("Postorder: ");
                    postorder(root);
                    System.out.println();
                }
                case 8 -> System.out.println("Exiting... 👋");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }

    // MAIN
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.menu();
    }
}
