package array.rotations;

public class RotateArray {
	
	/*Function to left rotate array of size n by d*/
	public static void leftRotate(int arr[],int d,int n) {
		for (int i=0; i<d; i++)
			leftRotatebyOne(arr, n);
	}

	public static void leftRotatebyOne(int[] arr, int n) {
		int i,temp;
		temp = arr[0];
		for(i=0; i< n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	public static void printArray(int arr[], int n) {
		for(int i =0; i<n; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9};
		leftRotate(arr, 14, 5);
		printArray(arr, 5);
	}

}
