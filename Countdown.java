import java.util.*;
public class Countdown {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = src.nextInt();

        while(num>0){
            System.out.println(num);
            num--;
        }
        src.close();
    }
}
