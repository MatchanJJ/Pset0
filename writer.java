package prac;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class writer {
public static void main(String[] args) {
  double wg,ht,bmi;
  int age;
  String first,second;
  first =JOptionPane.showInputDialog("Enter First Name");
  second =JOptionPane.showInputDialog("Enter Last Name");
  age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
  wg =Double.parseDouble(JOptionPane.showInputDialog("Enter Weight in kiligrams (kg)"));
  ht =Double.parseDouble(JOptionPane.showInputDialog("Enter Height in meters (m)"));
  bmi = wg / (ht*ht) ;
  String fname = (first+ " "+ second);
    if (bmi<18.5){
    JOptionPane.showMessageDialog(null, "Full Name: "+ fname + "\nAge: "+age+ "\nBMI:" +String.format("%.2f", bmi)+"\nClassification: Underweight");
  }else if (18.5 <= bmi && bmi<=24.9){
    JOptionPane.showMessageDialog(null, "Full Name: "+ fname + "\nAge: "+age+ "\nBMI:" +String.format("%.2f", bmi)+"\nClassification: Normal");
}else if (25.0<=bmi && bmi<=29.9){
    JOptionPane.showMessageDialog(null, "Full Name: "+ fname + "\nAge: "+age+ "\nBMI:" +String.format("%.2f", bmi)+"\nClassification: Overweight");
}else
JOptionPane.showMessageDialog(null, "Full Name: "+ fname + "\nAge: "+age+ "\nBMI:" +String.format("%.2f", bmi)+"\nClassification: Obese");
  
    File file = new File("C:\\New folder\\Palma.txt");
  try {
    FileWriter writer = new FileWriter(file,true);
      writer.write("Full Name: "+ fname + "\nAge: "+age+ "\nBMI: "+String.format("%.2f", bmi));
        if (bmi<18.5) {
            writer.write("\nClassification: Underweight");
      }else if (18.5 <= bmi && bmi<=24.9) {
        writer.write("\nClassification: Normal");
  }else if (25.0<=bmi && bmi<=29.0) {
    writer.write("\nClassification: Overweight");
}
else
writer.write("\nClassification: Obese");
writer.close();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
