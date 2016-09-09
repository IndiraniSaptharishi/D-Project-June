package week7;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan =new Scanner(System.in);//getting the input in the run time
 
  System.out.println("Enter the String: ");
  String str =scan.nextLine();
  System.out.println("Reverse of a string:");
  for(int i=str.length()-1;i>=0;i-- ){   //using the reverse for loop 
	  System.out.print(str.charAt(i));  //Printing the each character in reverse
  }

	}

	
}
