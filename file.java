import javax.swing.*;
public class file {
    
    public static void main (String[] args){
        boolean exit = false;
        do{
        int hours = 0, overtime = 0;
        Double hourly_rate = 1.5, overtime_rate = 2.5;
        

        hours = Integer.parseInt(JOptionPane.showInputDialog("Hour consumed: "));
        Double totalR = hours*hourly_rate;

        overtime = Integer.parseInt(JOptionPane.showInputDialog("Overtimed Hours: "));
        Double totalO = overtime_rate * overtime;

        double total = totalO + totalR;
        JOptionPane.showMessageDialog(null, "total "+ total);
        }while (exit == false);
    }
}
