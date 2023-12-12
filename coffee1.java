import java.util.*;
public class coffee1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select coffee");
        System.out.println("1. Macchiato ");
        System.out.println("2. Matcha");
        System.out.println("3. Americano");
          String coffeeChoice =scan.nextLine();
     
       
      /*  do{
        System.out.println("Select coffee");
        System.out.println("1. Macchiato ");
        System.out.println("2. Matcha");
        System.out.println("3. Americano");
         coffeeChoice = scan.nextLine();
       }while(coffeeChoice == "1" && coffeeChoice == "2" &&coffeeChoice == "3"&&coffeeChoice == "macchiato"&&coffeeChoice == "matcha"&&coffeeChoice == "americano");*/
            boolean isHot, withSugar;

           String coffeeName = "";

           coffeeChoice = coffeeChoice.toLowerCase();
 while (coffeeChoice != "1" && coffeeChoice == "2" &&coffeeChoice == "3"&&coffeeChoice == "macchiato"&&coffeeChoice == "matcha"&&coffeeChoice == "americano") {
        
        System.out.println("Select coffee");
        System.out.println("1. Macchiato ");
        System.out.println("2. Matcha");
        System.out.println("3. Americano");
         coffeeChoice = scan.nextLine();
         
           switch (coffeeChoice) {

           case "1":
           case "macchiato":

                coffeeName = "Your order is a cup of Macchiato,";
                System.out.println("Is the coffee hot? (true/false): ");
                isHot = scan.nextBoolean();
                System.out.println("Would you like sugar? (true/false): ");
                withSugar = scan.nextBoolean();
                System.out.print(coffeeName+" ");

                if (isHot) {
                     System.out.print("hot and ");
                } else {
                     System.out.print("cold and ");
                }

                if (withSugar) {
                     System.out.println("with sugar ");
                } else
                     System.out.println("without sugar ");
                break;
 
           case "2":
           case "matcha":

                coffeeName = "Your order is a cup of Matcha,";
                System.out.println("Is the coffee hot? (true/false): ");
                isHot = scan.nextBoolean();
                System.out.println("Would you like sugar? (true/false): ");
                withSugar = scan.nextBoolean();
                System.out.print(coffeeName+" ");

                if (isHot) {
                     System.out.print("hot and ");
                } else {
                     System.out.print("cold and ");
                }

                if (withSugar) {
                     System.out.println("with sugar ");
                } else
                     System.out.println("without sugar ");
                break;

           case "3":
           case "americano":

                coffeeName = "Your order is a cup of Americano,";
                System.out.println("Is the coffee hot? (true/false): ");
                isHot = scan.nextBoolean();
                System.out.println("Would you like sugar? (true/false): ");
                withSugar = scan.nextBoolean();
                System.out.print(coffeeName+" ");

                if (isHot) {
                     System.out.print("hot and ");
                } else {
                     System.out.print("cold and ");
                }

                if (withSugar) {
                     System.out.println("with sugar ");
                } else
                     System.out.println("without sugar ");
                break;
           default:
                System.out.println("Not available.");
                break;
            
            }
           scan.close();
                     
        
}

} }