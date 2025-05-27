package arrayproj1;
//compare duplicate element
public class comaperarrayduplicate {

	public static void main(String[] args) {
		int arr[]= {1,4,5,6,2,1,5,2};
		int arr1[]= {1,4,5,6,2,1,5}; 
		int count=0;
		int i;
 		for(int i1=0;i1<arr.length;i1++) {
			if(arr[i1]!=arr1[i1]) {
				count++;
			}
			
			
			if(count==0) {
				System.out.println("array  are equal");
				break;
			}
	
		}
	}

}
