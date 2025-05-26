package arrayproj1;

public class newclass {

	public static void main(String[] args) {
		int arr[]= {34,56,77,23,13,3,88};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
				
	
			}
		}
			if(count==0) {
				System.out.println("there is no odd element");
				
			}else {
				System.out.println("this array contains odd element");
			}
	        
			}

	}

