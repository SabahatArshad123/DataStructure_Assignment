// DoublyLinkedList.java

class DoublyLinkedList {
    static class Node {
        int data;
        Node next, prev;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    // Add a node at the end
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
            newNode.prev = current;
        }
    }

    // Print the list from head to tail
    public void printListForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Print the list from tail to head
    public void printListBackward() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.print("Forward Traversal: ");
        list.printListForward();

        System.out.print("Backward Traversal: ");
        list.printListBackward();
    }
}
