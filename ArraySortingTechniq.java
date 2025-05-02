package ArraySortingtechniq;
import java.util.Arrays;

public class Arraysorting  {
    
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];

        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}











































































//INSERTION SORT 

/* public static void insertionSort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
        int key = arr[i];       
        int j = i - 1;         
        
        
        
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]; 
            j = j - 1;
        }

     
        arr[j + 1] = key;
    }
}

public static void printArray(int[] arr) {
    for (int val : arr) {
        System.out.print(val + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    int[] arr = {6, 4, 8, 1};

    System.out.println("Original array:");
    printArray(arr);

    insertionSort(arr);

    System.out.println("Sorted array:");
    printArray(arr);

*/
 
//BUBBLE SORT 

/* public static void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;

        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }

        // If no elements were swapped, array is sorted
        if (!swapped) {
            break;
        }
    }
}

public static void main(String[] args) {
    int[] arr = {6, 8, 4, 1};
    
    System.out.println("Original array:");
    for (int val : arr) {
        System.out.print(val + " ");
    }

    bubbleSort(arr);

    System.out.println("\nSorted array:");
    for (int val : arr) {
        System.out.print(val + " ");
    }
/*



//SELECTION SORT
/*int arr[] = new int[4];
arr[0] = 6;
arr[1] = 8;
arr[2] = 4;
arr[3] = 1;
int n = arr.length;
int minIndex;

for (int i = 0; i < n - 1; i++) {
    minIndex = i;
    for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }
    
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
}

System.out.println("Sorted array:");
for (int num : arr) {
    System.out.print(num + " ");
}
*/
