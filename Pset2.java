import java.util.Scanner;

public class Pset2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) { // misplaced semicolon, it will terminate the statement and wont proceed to the else statement if the condition did not meet the condition - SYNTAX ERROR
            System.out.println("You are eligible to vote!");

            if (age >= 60) { 
                System.out.println("You are a senior citizen.");
            } else if (age >= 20) { // the condition should be age >= 20 because only the age 20 will output "You are an adult" thus, it should output this statement to ages 20 - 59 - LOGICAL ERROR
                System.out.println("You are an adult.");
            } else if(age >= 18){ // it should be else if - SYNTAX ERROR // since 18 and 19 is considered young voter the condition must be  (age >= 18) - LOGICAL ERROR
                System.out.println("You are a young voter.");
            }
            
        } else {
            System.out.println("You are not eligible to vote yet.");
            if (age >= 13) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are a child.");
            }
        }
 
        scanner.close();
    }
}
