package dailyquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try {
			BufferedReader String=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number: ");
			int a=Integer.parseInt(String.readLine());
			double fact=1;
			int i;
			System.out.println("Factorial of " +a);
			for(i=1;i<=a;i++){
				fact=fact*i;
				}
			System.out.println("Print the Factorial result: " +fact);
		} catch (Exception e) {
			System.out.println("Array out of bound exception");
		}
	}

}
