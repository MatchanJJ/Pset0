import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;

        try {
             do {
            System.out.print("Enter value 1: ");
            double result = scanner.nextDouble();

            while (true) {
                System.out.print("Enter operator (+, -, *, /) or 'done' to finish: ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("done")) {
                    break;
                }

                operator = input.charAt(0);

                System.out.print("Enter next value: ");
                double currentValue = scanner.nextDouble();

                switch (operator) {
                    case '+':
                        result += currentValue;
                        break;
                    case '-':
                        result -= currentValue;
                        break;
                    case '*':
                        result *= currentValue;
                        break;
                    case '/':
                        if (currentValue != 0) {
                            result /= currentValue;
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator. Please try again.");
                        continue;
                }
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (y/n): ");
        } while (scanner.next().charAt(0) == 'y');

        System.out.println("Calculator closed.");
        scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
       
    }

}
