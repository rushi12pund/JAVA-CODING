package ExeptionHAndling;

public class exeption {
	public static void main(String[] args) {
		int a=20 ,b=0, c  ;
		
		try {
		c=a/b;
		System.out.println("Division is " + c);
		}
		
		catch(Exception a1) {
			System.out.println("Zero can not Divide to any number");
		}
		
		System.out.println("Welcome to mumbai " );
	
	}
		
}
