package JAVACOnstructo;

public class inhe {
//immutable object : its creates another object  to print the concated veriable 
	public static void main(String args[]) {
	    String name= new String("hello");
	    
	   name=name.concat("india");	 
	    
	    System.out.println(name);


		    
	//mutable : here we can directly append the veriable to the hello
	    
	    StringBuilder b1= new StringBuilder("hello");
	 b1= b1.append("india");
	 
	 System.out.println(b1);
	 
	 
	}
	
	
}
