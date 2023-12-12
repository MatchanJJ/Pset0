
import java.util.Currency;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner src = new Scanner (System.in);
		
		double balance = 10000;	
		System.out.println("-------------------------------");
		System.out.println("JADE'S AUTOMATIC TELLER MACHINE");
		System.out.println("-------------------------------");
		
		System.out.println("1. Wihtdraw" + "\n2. Deposit"+"\n3. Inquire");
		String input = src.next();
		double available = 0;
		
		String currencyCode = "PHP";
		Currency currency = Currency.getInstance(currencyCode);
		
		
		switch(input){
		case "1":
			
			System.out.println("Enter Ammount:");
			double withdraw = src.nextDouble();
			available = balance - withdraw;
			if (withdraw>balance){
				System.out.println("Insufficient Balance");
			} else
			System.out.println("--------------------"+"\nYour ATM Receipt"+"\nTRANSACTION"+"\nWITHDRAW"+"\nAmmount: "+currency.getSymbol()+String.format("%.2f",withdraw) +"\nAvailable balance: "+currency.getSymbol()+String.format("%.2f", available));
		break;
		case "2": 
			System.out.println("Enter Ammount");
			double deposit = src.nextDouble();
			available = balance + deposit;
			System.out.println("--------------------"+"\nYour ATM Receipt"+"\nTRANSACTION"+"\nDEPOSIT"+"\nAmmount: "+currency.getSymbol()+String.format("%.2f",deposit)+"\nAvailable balance: "+currency.getSymbol()+String.format("%.2f",available));
			break;
		case "3": 
			available = balance;
			System.out.println("--------------------"+"\nYour ATM Receipt"+"\nTRANSACTION"+"\nBALANCE INQUIRY"+"\nAvailable balance: "+currency.getSymbol()+String.format("%.2f",available));
			break;
		default:
			System.out.println("Invalid Input");
		}
		src.close();
	}

}


 
