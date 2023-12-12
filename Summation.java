import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter Number between 1 and 20: ");
        int num = src.nextInt();

        while (num < 1  || num > 20) {
            System.out.println("Invalid Input. Please enter a number between 1 and 20.");
            System.out.println("Enter Number between 1 and 20: ");
            num = src.nextInt();
        }
        while (num > 0) {
            sum += num;
            num -= 1;
        }

        System.out.println("Summation: " + sum);
        src.close();
    }
}
