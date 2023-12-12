import java.util.*;
public class piglatin {

	public static void main(String[] args) {
		Scanner src = new Scanner (System.in);
		System.out.println("Enter A Word: ");
		String word = src.nextLine();
		String piglatin = "";
		
		
		int strLength = word.length();
		
		for(int i = 1; i < strLength;i++){
			piglatin += word.charAt(i);
	
		 }
		piglatin += word.charAt(0) + "ay";
		System.out.println(piglatin);
		}
		
		
	}



