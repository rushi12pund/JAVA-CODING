package Day4javapractical;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		System.out.println("Enter the one number : ");
		
		
Scanner s1= new Scanner(System.in);
int num=s1.nextInt();
		int temp=num;
		int rem;
		int result=0;
		
		
		while(temp > 0) {
			rem=temp%10;//153%3=3
			result+=Math.pow(rem,3);
			
			temp=temp/10;
			
			
			
		}
		
		if(result==num) {
			System.out.println("this is the arm strong number  ");
		}else {
			System.out.println("this is not  the arm strong number  ");
		}
		}

	}
