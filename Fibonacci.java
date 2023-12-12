import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int numTerms = src.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci sequence up to " + numTerms + " terms:");

        // Loop to generate and display Fibonacci sequence
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
    }
}
