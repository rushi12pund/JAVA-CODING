package Source;

import java.util.Scanner;

public class palindrom {

	public static void main (String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		int num=sc.nextInt();
		
		int rev = 0;
		
		int temp = num;
		
		while(num>0) {
			int digit = num%10;
			rev= rev*10+digit;
			num=num/10;
		}
		
		if(rev==temp) {
			System.out.println("Palindrom");
		}else {
			System.out.println("not Palindrom");
		}
		
		
		
		
	}
}
