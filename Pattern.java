import java.util.*;
public class Pattern{

public static void main(String[] args) {
    Scanner src = new Scanner (System.in);
    System.out.println("Enter Number: ");
    int num = src.nextInt();

    for (int row = 1; row<=num; row++){
        for(int column = 1; column <= row; column++){
            System.out.print(column+" "); 
        }
        System.out.println();
    }
    src.close();
}
}