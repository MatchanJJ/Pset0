import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PracArray {
    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(System.in);
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\BSCS 1st Sem\\BSCS 2nd Term\\CCE109\\output.txt"));

        double deposit,withdraw;
        double balance = 1000;
        String name, depositFormat, balanceFormat , withdrawFormat, numberFormat;
        int cardNumber=0; 
        int number = 0;

        System.out.println("Welcome to Jade's ATM!!!");
        System.out.println("Enter Name: ");
        name = src.nextLine().toUpperCase();
       do{
        try {
        System.out.println("Enter 10-digit Card Number: ");
        number = src.nextInt();
        if (idCounter(cardNumber, number) != 10) {
            System.out.println("Invalid Card Number. Try Again");
            continue;
        }else{
            break;
        }
        } catch (InputMismatchException e) {
           System.out.println("Error Detected");
           src.nextLine();
           continue;
        }
       
       }
        while (true);
        
        System.out.println("(1) Deposit"+"\n(2) Withdraw");
        int atm = src.nextInt();

        switch (atm) {
            case 1:
        System.out.println("Enter Ammount: ");
        deposit = src.nextDouble();
        balance += deposit;
        depositFormat = String.valueOf(String.format("%,.2f",deposit)); 
        balanceFormat = String.valueOf(String.format("%,.2f", balance));
        numberFormat =  String.valueOf(number);
        System.out.println("Get your receipt");

        String [] array = {name, numberFormat,depositFormat,balanceFormat};
        
            try {
                writer.write("\n Name: "+array [0]);
                writer.write("\n Account Number: "+array[1]);
                writer.write("\n Deposit: "+ array [2]);
                writer.write("\n Current Balance: "+ array [3]);
                writer.write("\n Total Balance: "+ array [3]);
            } catch (IOException e) {
              
            }

         writer.close();
                break;
        case 2:
        while (true){
        System.out.println("Enter Ammount: ");
        withdraw = src.nextDouble();
        if (withdraw == balance) {
            break;
        }else
        System.out.println("Insuficient Balance. Try Again");
        }
        
        balance -= withdraw;
        withdrawFormat = String.valueOf(String.format("%,.2f",withdraw)); 
        balanceFormat = String.valueOf(String.format("%,.2f", balance));
        numberFormat =  String.valueOf(number);
        System.out.println("Get your receipt");


            String [] array1 = {name, numberFormat,withdrawFormat,balanceFormat};
        
            try {
                writer.write("\n Name: "+array1 [0]);
                writer.write("\n Account Number: "+array1[1]);
                writer.write("\n Deposit: "+ array1 [2]);
                writer.write("\n Current Balance: "+ array1 [3]);
                writer.write("\n Total Balance: "+ array1 [3]);
            } catch (IOException e) {
                
            }
            writer.close();
        break;
        default:
        System.out.println("Invalid Option");
        }
        src.close();
    }
    public static int idCounter (int cardNumber,int number){
        int count = 0;
        while (number>0){
            count++;
            number /= 10;
        }
        return count;
        
    }
}
