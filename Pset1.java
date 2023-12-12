import javax.swing.JOptionPane;

public class Pset1 {
    public static void main(String[] args) {
        
        String ageInput = JOptionPane.showInputDialog(null, "Enter your age:");
        int age = Double.parseDouble(ageInput); // Data Type mismatch it should be Integer.parseInt - SYNTAX ERROR

        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "You are eligible to vote!");

            switch (age) {
                case 60:
                    JOptionPane.showMessageDialog(null, "You are exactly 60 years old.");
                    break;
                case 61:
                      // needs a break statement so that if the user input 61 it will not fall through the next case - LOGICAL ERROR
                case 62:

                    JOptionPane.showMessageDialog(null, "You are a senior citizen.");
                    break;
                default:
                    if (age <= 20) { // the output of You are an adult is only applicable to age 18- 20 and thus contradicts the typical definition of adulthood, the condition must be (age >= 20) so that ages 18 - 19 will output  "You are a young voter" and ages 20 - 59 will output "You are an adult" - LOGICAL ERROR
                        JOptionPane.showMessageDialog(null, "You are an adult."); 
                        // we need to add another condition because if the user input 63 and above it will output "You are an adult" wherein it must output "You are a senior citizen" - LOGICAL ERROR
                  /*  
                     } else if (age >= 63){
                        JOptionPane.showMessageDialog(null, "You are a senior citizen.");
                        
                 */
                    } else{
                         JOptionPane.showMessageDialog(null, "You are a young voter.");
                    }
            }
        } else {
            JOptionPane.showMessageDialog(null, "You are not eligible to vote yet.");

            switch (age) { // add case 16 and 17 before the "You are a teenager" statement because they are also part of the teenage age range and ages below 12 is considered in the childhood age range - LOGICAL ERROR
                case 13:
                case 14:
                case 15:
                // case 16:
                // case 17:
                    JOptionPane.showMessageDialog(null, "You are a teenager.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You are a child.");
            }
        }
    }
}
