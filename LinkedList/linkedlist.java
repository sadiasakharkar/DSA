package LinkedList;

public class linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public linkedlist() {
        this.size = 0;
    }

    // insert at beginning
    public void insertfirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // insert at given index
    public void insert(int data, int index) {
        if (index == 0) {
            insertfirst(data);
            return;
        }
        if (index == size) {
            insertlast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    // insert at end
    public void insertlast(int data) {
        Node node = new Node(data);

        if (tail == null) {
            insertfirst(data);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public Node find(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // get node at index
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // delete first
    public int deletefirst() {
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    // delete at index
    public int delete(int index) {
        if (index == 0) {
            return deletefirst();
        }

        if (index == size - 1) {
            return deletelast();
        }

        Node prev = get(index - 1);
        int data = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return data;
    }

    // delete last
    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int data = tail.data;
        tail = secondlast;
        tail.next = null;
        size--;
        return data;
    }

    // display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Node class
    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // main method to test
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        // insertion
        list.insertfirst(5);
        list.insertfirst(4);
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);
        list.insertlast(6);
        list.insert(10, 3);

        // deletion
        System.out.println("Deleted first: " + list.deletefirst());
        list.display();
        System.out.println("Deleted last: " + list.deletelast());
        list.display();
        System.out.println("Deleted at index 3: " + list.delete(3));

        // display
        list.display();
    }
}
