
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second floating point number: ");
        double num2 = scanner.nextDouble();

        if (Math.abs(num1 - num2) < 0.001) {
            System.out.println("The two numbers are the same up to three decimal points.");
        } else {
            System.out.println("The two numbers are not the same up to three decimal points.");
        }

        scanner.close();
    }
}
```