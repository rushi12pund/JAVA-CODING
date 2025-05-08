package Day9Multidimentionarray;
import java.util.Scanner;

public class Multi {

    public static void main(String[] args) {
        
    	System.out.println("Accept Arrays:");
        Scanner s1 = new Scanner(System.in);
        
        int a[][][] = new int[2][3][3]; // a[0] and a[1] are 2 matrices
  int temp=0;
        // Input for both matrics 
        for (int k = 0; k < 2; k++) {
            System.out.println("Enter elements for Matrix " + (k + 1) + ":");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[k][i][j] = s1.nextInt();
                }
            }
        }
        System.out.println("inter change ");   
         
        
       
        for (int k = 0; k < 2; k++) {
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                	
                	 temp=a[0][i][j];
                 	a[0][i][j]=a[1][i][j];
                 	a[1][i][j]=temp;
                	
                 	System.out.println(a[0][i][j]+" "+a[1][i][j]+" ");         	
                 	System.out.println(" ");  
            }
        }
        }
    }
}












































//other codes















//addition of two matrix in multi dimention matrix

//	System.out.println("accept Array :");
//	Scanner s1=new Scanner(System.in);
//	
//	int a[][][]= new int[2][3][3];
//for(int k=0;k<2;k++){
//	System.out.println("array "+k);
//	for(int i=0;i<3;i++){
//		
//		for(int j=0;j<3;j++ ){
//			
//			a[k][i][j]=s1.nextInt();
//			
//		}
//		
//	}
//	
//}
//System.out.println("addition Of Matrix is ");
//for(int i=0;i<3;i++) {
//	for( int j=0;j<3;j++) {
//		System.out.print(a[0][i][j]+a[1][i][j]+" ");
//		
//	}
//	System.out.println("\t");
//}
//
//	
//	



//PRINT EVEN AND ODD 1 O WHERE NUMBER IS EVEN AND ODD
//int a[][] = new int[3][3];
//Scanner s1 = new Scanner(System.in);
//
//System.out.println("Accept array:  \t" );
//
//// Accept array elements
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        a[i][j] = s1.nextInt();
//        
//        if(a[i][j]%2==0) {
//        	a[i][j]=0;
//         }
//        else if(a[i][j]%2!=0){
//        	 a[i][j]=1;
//         }
//        
//        
//    }
//}
//
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//    	
//    	System.out.println(a[i][j]+"" ); 	
//    	
//    	
//    }
//}
//


//PRINT O WHERE NUMBER IS EVEN
//int a[][] = new int[3][3];
//Scanner s1 = new Scanner(System.in);
//
//System.out.println("Accept array:  \t" );
//
//// Accept array elements
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        a[i][j] = s1.nextInt();
//        
//        if(a[i][j]%2==0) {
//        	a[i][j]=0;
//         }
//        
//        
//    }
//}
//
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//    	
//    	System.out.println(a[i][j]+"" ); 	
//    	
//    	
//    }
//}
//


// ADDITION OF TWO NUMBER AND SAVED IN C
//int a[][] = new int[3][3];
//int b[][] = new int[3][3];
//int c[][] = new int[3][3];
//Scanner s1 = new Scanner(System.in);
//
//System.out.println("Accept array A:  \t" );
//
//// Accept array elements
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        a[i][j] = s1.nextInt();
//    }
//}
//
//System.out.println("Accept array B:  \t" );
//
//// Accept array elements
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        b[i][j] = s1.nextInt();
//    }
//}
//
//System.out.println("addition OF Araay  \t" );
//
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//    	
//    	c[i][j]=a[i][j]+b[i][j];
//    	System.out.println("Addition is" +c[i][j]  );
//        
//        
//        
//
//}
//}




// Transpose OF array
//int a[][] = new int[3][3];
//Scanner s1 = new Scanner(System.in);
//
//System.out.println("Accept array:  \t" );
//
//// Accept array elements
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        a[i][j] = s1.nextInt();
//    }
//}

//// Display array elements
//System.out.println("The Transpose of array is");
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        System.out.print(a[j][i] + "\t"); // "\t" for tab spacing
//    }
//    System.out.println(); // new line after each row
//}
//
//s1.close(); // Always good practice to close Scanner
//
//
