package LinkedList;

// ==========================
// SINGLY LINKED LIST (SLL) IMPLEMENTATION IN JAVA
// ==========================

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SinglyLinkedList {
    Node head = null;

    // ==========================
    // 1) insertFirst(data)
    // ==========================
    void insertFirst(int data) {
        Node N = new Node(data);
        N.next = head;
        head = N;
    }

    // ==========================
    // 2) insertLast(data)
    // ==========================
    void insertLast(int data) {
        Node N = new Node(data);
        if (head == null) {
            head = N;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = N;
    }

    // ==========================
    // 3) insertAt(index, data)
    // ==========================
    void insertAt(int index, int data) {
        if (index == 0) {
            insertFirst(data);
            return;
        }

        Node N = new Node(data);
        Node ptr = head;

        for (int i = 0; i < index - 1; i++) {
            if (ptr == null) {
                System.out.println("Invalid index");
                return;
            }
            ptr = ptr.next;
        }

        if (ptr == null) {
            System.out.println("Invalid index");
            return;
        }

        N.next = ptr.next;
        ptr.next = N;
    }

    // ==========================
    // 4) deleteFirst()
    // ==========================
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // ==========================
    // 5) deleteLast()
    // ==========================
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    // ==========================
    // 6) deleteAt(index)
    // ==========================
    void deleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }

        Node ptr = head;
        for (int i = 0; i < index - 1; i++) {
            if (ptr.next == null) {
                System.out.println("Invalid index");
                return;
            }
            ptr = ptr.next;
        }

        if (ptr.next == null) {
            System.out.println("Invalid index");
            return;
        }

        ptr.next = ptr.next.next;
    }

    // ==========================
    // 7) search(value)
    // ==========================
    void search(int value) {
        Node ptr = head;
        int index = 0;

        while (ptr != null) {
            if (ptr.data == value) {
                System.out.println("Found at index: " + index);
                return;
            }
            ptr = ptr.next;
            index++;
        }
        System.out.println("Value not found");
    }

    // ==========================
    // 8) display()
    // ==========================
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    // ==========================
    // 9) isEmpty()
    // ==========================
    boolean isEmpty() {
        return head == null;
    }

    // ==========================
    // MAIN METHOD FOR TESTING
    // ==========================
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertAt(1, 15);
        list.display();

        list.deleteAt(2);
        list.display();

        list.search(15);
        System.out.println("Is Empty: " + list.isEmpty());
    }
}
