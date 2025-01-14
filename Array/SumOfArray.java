import java.util.Scanner;

public class ArraySum {

    // Method to find the sum of two arrays
    public static int[] sumOfArrays(int[] array1, int[] array2) {
        int maxLength = Math.max(array1.length, array2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int value1 = (i < array1.length) ? array1[i] : 0;
            int value2 = (i < array2.length) ? array2[i] : 0;
            result[i] = value1 + value2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first array
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the second array
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Find the sum of the arrays
        int[] sumArray = sumOfArrays(array1, array2);

        // Print the result
        System.out.println("The sum of the two arrays is:");
        for (int value : sumArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
