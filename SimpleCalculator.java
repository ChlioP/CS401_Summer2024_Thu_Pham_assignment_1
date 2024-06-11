import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Welcome to the Simple Calculator!");

        while (continueCalculation) {
            double num1 = getNumber(scanner, "Enter the first number: ");
            double num2 = getNumber(scanner, "Enter the second number: ");
            int operation = getOperation(scanner);

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String response = scanner.next().trim().toLowerCase();
                continueCalculation = response.equals("yes");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    private static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // clear invalid input
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }

    private static int getOperation(Scanner scanner) {
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter the operation number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please select a valid operation number.");
            scanner.next(); // clear invalid input
            System.out.print("Enter the operation number: ");
        }
        return scanner.nextInt();
    }
}
