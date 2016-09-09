package prime;

public class Checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Initializing the given number
		int n =17;
		int i,m,flag = 0;
		m=n/2;
		for(i=2;i<=m;i++){
			if(n%i==0){
				System.out.println("The number is not prime:");
				flag=1;
				break;
				}
		}
			if(flag==0) 
				System.out.println("The number is prime:");
	}
	}



