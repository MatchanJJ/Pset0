import java.util.Scanner;

public class Checkname {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String firstName;
      do {
        System.out.print("Enter firstname: ");
         firstName = src.nextLine().toLowerCase();

         if (firstName.contains("isis")) {
            System.out.println("WARNING! CHECK IDENTITY");
            
         } else 
         System.out.println("Welcome, "+firstName.toUpperCase()+"!!!");
         
        
      } while (firstName.contains("isis"));
        

       src.close();
    }
}
