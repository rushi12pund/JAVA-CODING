package arrayproj1;
//large Element
public class large_element {

	public static void main(String[] args) {
		int arr[]= {1,4,5,6,2,1,5,2};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]> max) {
				max= arr[i];
			}
			System.out.println("max element is "+max);
			break;
		}

	}

}
