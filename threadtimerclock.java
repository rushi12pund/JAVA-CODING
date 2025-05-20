package multi;

public class timer {
	  public static void main(String[] args) {
		  
		  for (int hour=12;hour<=24;hour++) {
			
          for ( int min=1;min<=60;min++) {
         	
	      for (int sec=1;sec<=60;sec++) {
	    	
	     System.out.println(hour+":"+min+":"+sec);  
	  	  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	      
          }
			  
	  
			  
		  }
	  }
}
