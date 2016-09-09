package week7;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter a number");
int num=scan.nextInt();
int reverse=0;
System.out.println("Reverse is : ");
while(num>0){
	int rem=num%10;
	reverse=(reverse*10 )+rem;
	num=num/10;
	
}
System.out.println(reverse);
	}

}
