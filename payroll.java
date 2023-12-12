import javax.swing.*;
import java.text.*;
public class payroll {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat();
        
        double hourlyRate1 = 200;
        double hourlyRate2 = 300;
        double hourlyRate3 = 500;
        double monthlyRate = 0;
        double overtimeRate =0;
        int hours;
        int overtime;
        double totalSalary = 0;
        String rank;

        JOptionPane.showMessageDialog(null, "Welcome to the Payroll Portal!!!");
        String status = JOptionPane.showInputDialog("Employment Status "+"\n(1)Full-Time "+"\n(2)Part-Time").toLowerCase();

       switch (status) {
        case "1":
        case "full-time":
                rank = JOptionPane.showInputDialog("Enter Rate"+"\n(1) Entry Level Developer"+"\n(2)Junior Developer"+"\n(3)Senior Developer").toLowerCase();
                switch (rank) {
                    case "1":
                    case "entry level developer":
                        hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Worked Hours"));
                        monthlyRate = hours * hourlyRate1;
                            if (hours > 160){
                                overtime = hours - 160;
                            }
                            overtimeRate = hourlyRate1 * 1.5 ;
                            totalSalary = overtimeRate + monthlyRate;


                            JOptionPane.showMessageDialog(null, "Hourly Salary: PHP"+ format.format(monthlyRate)+"\nOvertime Salary: PHP"+format.format(overtimeRate) + "\nTotal Salary: PHP"+format.format(totalSalary));
                        break;
                    case "2":
                    case "junior developer":    
                     hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Worked Hours"));
                        monthlyRate = hours * hourlyRate2;
                            if (hours > 160){
                                overtime = hours - 160;
                            }
                            overtimeRate = hourlyRate1 * 1.5 ;
                            totalSalary = overtimeRate + monthlyRate;


                            JOptionPane.showMessageDialog(null, "Hourly Salary: PHP"+ format.format(monthlyRate)+"\nOvertime Salary: PHP"+format.format(overtimeRate) + "\nTotal Salary: PHP"+format.format(totalSalary));  
                            break;
                    case "3":
                    case "senior developer":
                         hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Worked Hours"));
                        monthlyRate = hours * hourlyRate3;
                            if (hours > 160){
                                overtime = hours - 160;
                            }
                            overtimeRate = hourlyRate1 * 1.5 ;
                            totalSalary = overtimeRate + monthlyRate;


                            JOptionPane.showMessageDialog(null, "Hourly Salary: PHP"+ format.format(monthlyRate)+"\nOvertime Salary: PHP"+format.format(overtimeRate) + "\nTotal Salary: PHP"+format.format(totalSalary));          
                            break;
                    default:
                    JOptionPane.showMessageDialog(null,"Invalid Input");
                        break;
                        
                }
            
        case "2":
        case "part-time":
        rank = JOptionPane.showInputDialog("Enter Rate"+"\n(1) Entry Level Developer"+"\n(2)Junior Developer"+"\n(3)Senior Developer").toLowerCase();
                switch (rank) {
                    case "1":
                    case "entry level developer":
                        hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Worked Hours"));
                        monthlyRate = hours * hourlyRate1;
                            if (hours > 80){
                                overtime = hours - 80;
                            }
                            overtimeRate = hourlyRate1 * 1.5 ;
                            totalSalary = overtimeRate + monthlyRate;


                            JOptionPane.showMessageDialog(null, "Hourly Salary: PHP"+ format.format(monthlyRate)+"\nOvertime Salary: PHP"+format.format(overtimeRate) + "\nTotal Salary: PHP"+format.format(totalSalary));
                        break;
                    case "2":
                    case "junior developer":    
                     hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Worked Hours"));
                        monthlyRate = hours * hourlyRate2;
                            if (hours > 80){
                                overtime = hours - 80;
                            }
                            overtimeRate = hourlyRate1 * 1.5 ;
                            totalSalary = overtimeRate + monthlyRate;


                            JOptionPane.showMessageDialog(null, "Hourly Salary: PHP"+ format.format(monthlyRate)+"\nOvertime Salary: PHP"+format.format(overtimeRate) + "\nTotal Salary: PHP"+format.format(totalSalary));  
                            break;
                    case "3":
                    case "senior developer":
                         hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Worked Hours"));
                        monthlyRate = hours * hourlyRate3;
                            if (hours > 80){
                                overtime = hours - 80;
                            }
                            overtimeRate = hourlyRate1 * 1.5 ;
                            totalSalary = overtimeRate + monthlyRate;


                            JOptionPane.showMessageDialog(null, "Hourly Salary: PHP"+ format.format(monthlyRate)+"\nOvertime Salary: PHP"+format.format(overtimeRate) + "\nTotal Salary: PHP"+format.format(totalSalary));          
                            break;
                    default:
                    JOptionPane.showMessageDialog(null,"Invalid Input");
                        break;
                        
                }
        default:
         JOptionPane.showMessageDialog(null,"Invalid Input");
            break;
            
       }
        
    }
}
