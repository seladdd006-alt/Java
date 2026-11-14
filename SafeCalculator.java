import java.util.Scanner;

public class SafeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            String input1 = scanner.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("Enter the second number: ");
            String input2 = scanner.nextLine();
            int num2 = Integer.parseInt(input2);

            int result = num1 / num2;

            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer (e.g., 'abc' is not allowed).");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            System.out.println("Operation complete.");
            scanner.close();
        }
    }
}
