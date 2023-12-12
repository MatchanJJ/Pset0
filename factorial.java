import java.util.*;
public class factorial {

    public static void main(String[] args) {
        Scanner src = new Scanner (System.in);
        int factorial = 1;
        System.out.println("Enter Value: ");
        int input = src.nextInt();

        if (input<0) {
            System.out.println("Invalid Input");     
        } else
        for (int i = 2; i <= input ; i++) {
           factorial *= i; // factorial = factorial * i
       


            
        }
        System.out.println("Results "+ factorial);
        
    }
}