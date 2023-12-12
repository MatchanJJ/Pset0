import java.util.Scanner;

public class CryptoInvestmentCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get initial investment amount
        System.out.print("Enter initial investment amount: ");
        double initialInvestment = scanner.nextDouble();

        // Set interest rate per period to 20%
        double interestRate = 0.20;

        // Get number of reinvestments
        System.out.print("Enter the number of times you want to reinvest: ");
        int reinvestmentCount = scanner.nextInt();

        // Calculate earnings with reinvestment
        double totalEarnings = calculateEarnings(initialInvestment, interestRate, reinvestmentCount);

        // Display the result
        System.out.println("Your total earnings after " + reinvestmentCount + " reinvestments: $" + totalEarnings);

        scanner.close();
    }

    private static double calculateEarnings(double initialInvestment, double interestRate, int reinvestmentCount) {
        double totalEarnings = initialInvestment;

        for (int i = 1; i <= reinvestmentCount; i++) {
            // Calculate earnings for each reinvestment
            double earnings = totalEarnings * interestRate;
            totalEarnings += earnings;

            System.out.println("Earnings after reinvestment " + i + ": $" + earnings);
            System.out.println("Total amount after reinvestment " + i + ": $" + totalEarnings);
        }

        return totalEarnings;
    }
}
