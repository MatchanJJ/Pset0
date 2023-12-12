import java.util.*;
public class Guess {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Random rand =  new Random();
        int answer = rand.nextInt(10);

        int num = 0;
        try {
               do {
            if(num>10){
                System.out.println("Invalid Input");
                break;
            }
            System.out.println("Guess the number between 1 and 10: ");
            num = src.nextInt();
        } while (num != answer);
            
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
     src.close();

    }
}
