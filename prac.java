import java.util.*;
import javax.swing.*;
import java.io.*;
public class prac {

    public static void main (String[]arghs){
        
        String date = JOptionPane.showInputDialog("Enter Date: ");
        int totalExp;
        int weekAll = Integer.parseInt(JOptionPane.showInputDialog("Enter Weekly Allowance: "));
        int expenses = Integer.parseInt(JOptionPane.showInputDialog("Enter Expenses:" + "\n1. Transportation" +"\n 2. Food"+"\n 3. Others"));

        if (expenses == 1){
            int transAmm = Integer.parseInt(JOptionPane.showInputDialog("Enter Ammount: "));
        }else if (expenses == 2){
            int foodAmm = Integer.parseInt(JOptionPane.showInputDialog("Enter Ammount: "));
        }else if (expenses == 3){
           int anyAmm = Integer.parseInt(JOptionPane.showInputDialog("Enter Ammount: "));
        } else 
            JOptionPane.showMessageDialog(null, "Invalid Input");
         


        File file = new File ("C:\\codes\\Tracker.txt");
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write("Date: "+date+"\n Total Expense: ");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
