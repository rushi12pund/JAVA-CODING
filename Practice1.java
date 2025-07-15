package Com;

public class Demo {

	public static void main(String[] args) {
		
		String str="Modi";
		String sr=" ";
		
		for(int i = str.length() - 1;i>=0;i--) {
			
			sr += str.charAt(i);
			
		}
		
		System.out.println(sr);
	}

}
