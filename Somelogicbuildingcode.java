package Learningpriviousprogram;
import java.util.Scanner;

public class evenoddnum {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = S1.nextInt();  

        if (a % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}





package Learningpriviousprogram;

public class oddnumber {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<100;i++) {
			
			if(i%2!=0) {
				System.out.println(+i);
				
			}
			
		}
	}

}









package Learningpriviousprogram;

import java.util.Scanner;

public class sesonsSwitch {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the Season (Summer / Winter / Monsoon): ");
        String a = s1.nextLine();  

        switch (a) {
            case "Summer":
                System.out.println("This is Summer season");
                break;

            case "Winter":
                System.out.println("This is Winter season");
                break;

            case "Monsoon":
                System.out.println("This is Monsoon season");
                break;

            default:
                System.out.println("Please enter a valid season.");
        }
    }
}





package Learningpriviousprogram;

public class fibonacci {
	 public static void main(String[] args) {
		 
		 
		 int n=10;
		 int First=0;
		 int second=1;
		 
		 System.out.println("Fibonacci Series:");
		 System.out.println(" " +First+ " " +second);
		 
		
		 for(int i=3;i<=n;i++) {
			 int next=First+second;
			 System.out.println(next + "");
			First=second;
			second=next;
			
		 }
		 
		 
		 
		 
		 
		 
	 }
}






package Learningpriviousprogram;
import java.util.Scanner;
public class Learningswitchcase {
			 
		  public static void main(String[] args) {

		 Scanner s1= new Scanner(System.in);
		 int num=s1.nextInt();
		 
		 
		 
		 switch (num) {
         case 1:
             System.out.println("January");
             break;

         case 2:
             System.out.println("February");
             break;

         case 3:
             System.out.println("March");
             break;

         case 4:
             System.out.println("April");
             break;

         case 5:
             System.out.println("May");
             break;

         case 6:
             System.out.println("June");
             break;

         case 7:
             System.out.println("July");
             break;

         case 8:
             System.out.println("August");
             break;

         case 9:
             System.out.println("September");
             break;

         case 10:
             System.out.println("October");
             break;

         case 11:
             System.out.println("November");
             break;

         case 12:
             System.out.println("December");
             break;

         default:
             System.out.println("Invalid input!");
     }
		 
		 
		 
		 
		 
		 
		 
	 }
}


















package Learningpriviousprogram;
import java.util.Scanner;
public class program {
	public static void main(String[] args) {
    Scanner s1= new Scanner(System.in);
    
    System.out.println("take a input from the user");
    int num=s1.nextInt();
    
    
    int[] count=new int[10];
    
    while(num>0) {
    	int digit=num%10;
    	count[digit]++;
    	num=num/10;
    }
    
    System.out.println("Digit count");
    for(int i=0;i<10;i++) {
    	if(count[i]>0) {
    		 System.out.println("Digit" +i+"count"+count[i]+"");
    	}
    }
    
    
    	
	}
}
