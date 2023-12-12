import java.text.*;

import javax.swing.JOptionPane;
public class Fare {
    
    public static void main (String []arghs){

        String name = JOptionPane.showInputDialog("Enter Your Name: ").toUpperCase();
		String address = JOptionPane.showInputDialog("Enter Your Address: ").toUpperCase();
		int noOfUnits = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Units Used: "));
		double billing = 0;
		double cost = 0;
		
		
		switch (address) {
		case "MAA":
			cost = 1.00;
			billing =  noOfUnits * cost;
			break;
		case "BUHANGIN":
			cost = 0.75;
			billing = noOfUnits * cost;
			break;
		case "TORIL":
			cost = 1.50;
			billing = noOfUnits * cost;
			break;
		case "BANKEROHAN":
			cost = 0.25;
			billing = noOfUnits * cost;
			break;
		default:
			cost = 0.50;
			billing =  noOfUnits * cost;
						
		}
		String costFormat = NumberFormat.getCurrencyInstance().format(cost);
		JOptionPane.showMessageDialog(null, "Name: "+ name + "\nAddress: "+ address+"\nNumber of Units Used: "+ noOfUnits+"\nCost Per Unit Used: "+costFormat +"\nTotal Billing Cost: "+ billing);
		

    }
}
