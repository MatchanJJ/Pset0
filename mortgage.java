import java.util.*;
import java.text.*;
public class mortgage {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double principal=0;
        double monthlyInterest=0;
        int NumofPayments=0;
        while (true){
        System.out.println("Enter Principal: ");
        principal = src.nextDouble();
        if (principal >= 1000 && principal <= 1000000)
            break;
         System.out.println("Enter number from $1K - $1M");
    }
        while (true){
        System.out.println("Enter Annual Interst Rate: ");
        double annualInterest = src.nextDouble();
        if (annualInterest >=1 && annualInterest <= 30){
         monthlyInterest = annualInterest / 100 / 12;
          break;
        } else
        System.out.println("Enter Interest Rate from 1 to 30");
        }
        

        while (true){
        System.out.println("Enter Period (YEARS): ");
        int years = src.nextInt();
        NumofPayments = years * 12;
        if (years >= 1 && years <= 30)
        break;
        System.out.println("Enter Yers from 1 to 30 Years");
        }
       
        double mortgage = principal * (monthlyInterest* Math.pow(1 + monthlyInterest, NumofPayments)/ (Math.pow(1 + monthlyInterest, NumofPayments)-1));
        String mortageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortageFormat);
        src.close();
    }
}
