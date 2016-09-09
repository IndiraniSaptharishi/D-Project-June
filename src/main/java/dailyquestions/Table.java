package dailyquestions;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
        int b=1;
		int c;
		System.out.println("Table of " +a+":");
		while(b<=20){
			c=a*b;
			b=b+1;
			System.out.println("Print the table: " +c);
					
		}
	}

}
