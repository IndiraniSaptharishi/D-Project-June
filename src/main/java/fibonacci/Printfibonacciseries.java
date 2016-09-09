package fibonacci;

public class Printfibonacciseries {
public static void main(String[] args) {
	int n1=0,n2=1,n3,i;
	System.out.println(n1+" "+n2); // print 0 and 1
	for(i=2;i<12;i++){  // loop starts from 2 as 0 & 1 are already printed
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}
	
	
}
}
