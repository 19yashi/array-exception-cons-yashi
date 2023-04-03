package yashi;

import java.util.Scanner;

public class MenuBasedTest {

	public static void main(String[] args) {
		Primeexample primeexample=new Primeexample();
		FactorialE factorialE =new FactorialE();
	}
}
		
		class Primeexample{
			public void name() {
		
		int i,m=0,flag=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number to test prime");
		int n=scanner.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" is not prime number");
		}else {
			for(i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println(n+"is not prime number");
					flag=1;
					break;
				}
			}
		}
	class FactorialE{
		public void main(String args[]) {
			int i,fact=1;
			int number=5;
			for(i=1;i<=number;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of "+number+"is:"+fact);
		}
	}
			}
		}



