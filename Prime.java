package Source;

import java.util.Scanner;

public class Prime_number {

public static void main(String[] args) {
		
	Scanner Sc = new Scanner(System.in);
	
System.out.println("enter the number");	
	int num = Sc.nextInt();
	
	boolean isprime = true;
	
	if(num <= 1) {
		isprime = false;
		}else {
			for(int i=2;i<num;i++) {
				
				if(num%i==0) {
					isprime = false;
				}else {
					isprime = true ;
				}
				
			}
		}
	
	if(isprime) {
		System.out.println("number is prime");
	}else {
		System.out.println("number is not prime");
	}
}
}

