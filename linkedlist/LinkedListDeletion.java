// Java program to implement a linked list with deletion functionality

class LinkedList {
    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to initialize the node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Head of the list

    // Constructor to initialize the linked list
    LinkedList() {
        this.head = null;
    }

    // Method to add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to delete a node with a specific value
    public void deleteNode(int key) {
        // Check if the head node itself needs to be deleted
        if (head != null && head.data == key) {
            head = head.next;
            return;
        }

        // Search for the node to be deleted
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding elements to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original List:");
        list.printList();

        // Deleting node with value 30
        list.deleteNode(30);
        
        System.out.println("List after deletion of 30:");
        list.printList();

        // Deleting node with value 10 (head node)
        list.deleteNode(10);
        
        System.out.println("List after deletion of 10:");
        list.printList();
    }
}
