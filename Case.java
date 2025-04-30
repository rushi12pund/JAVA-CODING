package caseclass;

import java.util.Scanner;

public class casingclass {

	public static void main(String[] args) {
		int choice;
		int a,b,c;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your Choice!");
		choice=s1.nextInt();
		switch(choice)
		{
			case 1:
		System.out.println("Enter A");
		a=s1.nextInt();
		System.out.println("Enter B");
		b=s1.nextInt();
		
		c=a+b;
		System.out.println("Addition is" +c);
		c=s1.nextInt();
		
			case 2:
				System.out.println("Enter A");
				a=s1.nextInt();
				System.out.println("Enter B");
				b=s1.nextInt();
				
				c=a-b;
				System.out.println("Substraction  is" +c);
				c=s1.nextInt();
				
			case 3:
				System.out.println("Enter A");
				a=s1.nextInt();
				System.out.println("Enter B");
				b=s1.nextInt();
				
				c=a*b;
				System.out.println("Multiplication  is" +c);
				c=s1.nextInt();
				
			case 4:
				System.out.println("Give the correct input");
		}
		
;		
	}

}
