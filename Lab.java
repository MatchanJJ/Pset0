    import java.util.*;
    public class Lab {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int number = 0;

            do {
                System.out.print("Enter a number (or a negative number to exit): ");
                number = scanner.nextInt();
                sum += number;

            } while (number >= 0);

            System.out.println("The sum of positive numbers is: " + sum);
            scanner.close();


    }

    }
        