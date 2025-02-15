class ArrayBinaryTree {
    int[] tree;
    int size;

    public ArrayBinaryTree(int capacity) {
        tree = new int[capacity];
        size = 0;
    }

    // Insert element in level order
    public void insert(int key) {
        if (size >= tree.length) {
            System.out.println("Tree is full!");
            return;
        }
        tree[size] = key;
        size++;
    }

    // Get left child index
    public int getLeftChild(int index) {
        int leftIndex = 2 * index + 1;
        return (leftIndex < size) ? tree[leftIndex] : -1;
    }

    // Get right child index
    public int getRightChild(int index) {
        int rightIndex = 2 * index + 2;
        return (rightIndex < size) ? tree[rightIndex] : -1;
    }

    // Get parent index
    public int getParent(int index) {
        if (index == 0) return -1; // Root has no parent
        return tree[(index - 1) / 2];
    }

    // Print tree as an array
    public void printTree() {
        for (int i = 0; i < size; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayBinaryTree tree = new ArrayBinaryTree(10);

        // Insert elements
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        System.out.println("Tree stored as an array:");
        tree.printTree(); // Output: 1 2 3 4 5 6 7

        System.out.println("Left child of 1: " + tree.getLeftChild(0)); // 2
        System.out.println("Right child of 1: " + tree.getRightChild(0)); // 3
        System.out.println("Parent of 4: " + tree.getParent(3)); // 2
    }
}
