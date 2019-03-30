package array.rotations;

public class LargestElement {

	/*Function to return largest element in array*/
	public static int largest(int arr[]) {
		int max = arr[0];
		int index = 0;
		for(int i= 1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Largest element in the array is " + max + " at index "+index);
		return max;	
	}

	public static void main(String[] args) {
		int arr[] = {15,18,2,3,6,12};
		int arr1[] = {7,9,11,12,15};
		int arr2[] = {7,9,11,12,5};
		largest(arr);
	}

}
