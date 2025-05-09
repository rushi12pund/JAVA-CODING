package inheritance;
import java.util.Scanner;
class Parking{
	
	void Charges(){
		System.out.println("you have to enter pay 20 for bike parking");
	}
}
class Entry extends Parking{
	
	void chacking() {
		System.out.println("Welcome to our Dmart ");
	}
}
class shopping extends Entry{
	int cloths=700, shoue=1000,jeans=980;
  int total=cloths+shoue+jeans;

  void billing() {
	  System.out.println("the total bill is "+ total);
  }
  
}
class exiting extends shopping{
	void exit() {
		 System.out.println("Thank you vist again!!");
	}
}





public class Dmart {
public static void main (String args[]) {
 exiting e1=new exiting();
 
 Scanner s1=new Scanner(System.in);
 System.out.println("If you have done the vaccination enter 'yes'");
 String ans=s1.next();
 if(ans.equals("yes"))
 {
	 
 
	e1.Charges();
	e1.chacking();
	e1.billing();
	e1.exit();
 }
}
}
