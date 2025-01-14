import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize array
        int[] array = new int[size + 1]; // Extra space for insertion
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the initial array
        System.out.print("Initial array: ");
        printArray(array, size);

        // Insertion details
        System.out.print("Enter the position to insert (0 to " + size + "): ");
        int position = scanner.nextInt();

        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position! Cannot insert.");
        } else {
            // Shift elements to the right
            for (int i = size; i > position; i--) {
                array[i] = array[i - 1];
            }
            // Insert the new value
            array[position] = value;
            size++;

            // Display the updated array
            System.out.print("Array after insertion: ");
            printArray(array, size);
        }

        scanner.close();
    }

    // Method to print the array
    private static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
