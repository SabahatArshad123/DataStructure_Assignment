public class ArrayDeletion {

    public static void main(String[] args) {
        // Initializing the array
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length; // Number of elements in the array
        
        // Position to delete (0-based index)
        int positionToDelete = 2;

        System.out.println("Original Array:");
        printArray(arr, n);

        // Deleting the element
        n = deleteElement(arr, n, positionToDelete);

        System.out.println("\nArray after deletion:");
        printArray(arr, n);
    }

    // Method to delete an element from the array
    public static int deleteElement(int[] arr, int n, int position) {
        // Check if the position is valid
        if (position < 0 || position >= n) {
            System.out.println("Invalid position");
            return n; // No change in size
        }

        // Shifting elements to the left
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1; // Decrement the size of the array
    }

    // Method to print the array
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
