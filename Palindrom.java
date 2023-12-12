import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("Input a word: ");
		String word = src.nextLine();

		String reverseStr = "";
	    
	    int strLength = word.length();

	    for (int i = (strLength - 1); i >=0; i--) {
	      reverseStr = reverseStr + word.charAt(i);
	      
	      
	    }

	    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println("Palindrome String.");
	    }
	    else {
	      System.out.println("Not A Palindrome String.");
	    }
	  }
	}

	


	













