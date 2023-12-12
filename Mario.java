import java.util.*;
public class Mario {
    public static void main(String[] args) {
        Scanner src =  new Scanner (System.in);

        int height = 0;
        int i,j,space;
        do {
            System.out.println("Enter Height: ");
            height = src.nextInt();
        } while (height < 1 || height > 8);
        for (i=0; i < height; i++ ){

        for(space = 0; space < height-i-1; space++){
            System.out.print(" ");
        }
        for(j=0; j <= i; j++){
             System.out.print("#");
        }
         System.out.print("  ");
        for (j=0; j<= i; j++){
             System.out.print("#");
        }
       
         System.out.println();
    }
}}
