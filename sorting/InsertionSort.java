package sorting;


public class InsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else break;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the insertion sort
    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        
        System.out.println("Unsorted Array:");
        printArray(data);
        
        insertionSort(data);

        System.out.println("Sorted Array:");
        printArray(data);
    }
}
