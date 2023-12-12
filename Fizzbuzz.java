
import java.util.*;
public class Fizzbuzz {
    
    public static void main (String[]arghs){
        Scanner src = new Scanner(System.in);
        
        System.out.println("Number: ");
        int num = src.nextInt();

        if (num% 5 == 0 && num % 3==0){
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0){
            System.out.println("Buzz");
        }else if (num% 5 == 0 ){
            System.out.println("Fizz");
        }else 
        System.out.println(num);

        src.close();
    }
}
