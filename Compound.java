import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();

        // Fixed annual interest rate of 12%
        double annualInterestRate = 0.12;

        System.out.print("Enter the number of years: ");
        int investmentYears = scanner.nextInt();

        // Calculate compound interest and total investment
        double[] results = calculateCompoundInterest(principalAmount, annualInterestRate, investmentYears);

        // Display the result
        System.out.printf("\nTotal principal invested: %.2f%n", results[0]);
        System.out.printf("Total compound interest earned after %d years: %.2f%n", investmentYears, results[1]);
        System.out.printf("Total principal invested plus compound interest after %d years: %.2f%n", investmentYears, results[2]);
    }

    public static double[] calculateCompoundInterest(double principal, double annualRate, int years) {
        double totalPrincipalInvested = 0;
        double totalCompoundInterest = 0;

        for (int i = 1; i <= years; i++) {
            // Calculate compound interest for the current year
            double interestEarned = principal * annualRate;
            totalCompoundInterest += interestEarned;

            // Add compound interest to the principal for reinvestment
            principal += interestEarned;

            // Accumulate total principal invested
            totalPrincipalInvested += principal;
        }

        return new double[]{totalPrincipalInvested, totalCompoundInterest, totalPrincipalInvested + totalCompoundInterest};
    }
}
