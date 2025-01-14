// LinkedListSearch.java

class LinkedList {
    // Node class represents each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Constructor to initialize the linked list
    public LinkedList() {
        head = null;
    }

    // Method to add a node at the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to search for a value in the linked list
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;  // Value found
            }
            current = current.next;
        }
        return false;  // Value not found
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding some elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Printing the linked list
        System.out.print("Linked List: ");
        list.printList();

        // Searching for an element
        int valueToSearch = 30;
        if (list.search(valueToSearch)) {
            System.out.println("Element " + valueToSearch + " found in the list.");
        } else {
            System.out.println("Element " + valueToSearch + " not found in the list.");
        }
    }
}
