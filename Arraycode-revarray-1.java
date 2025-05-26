package arrayproj1;

public class revarray {

	public static void main(String[] args) {
	int arr[]= {45,86,95,67,45,89,45};
	System.out.println("the array is");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
		
	}System.out.println("the reverse array is");
	for(int i=arr.length-1;i>0;i--) {
		System.out.println(arr[i]);
		
	}

	}
}

