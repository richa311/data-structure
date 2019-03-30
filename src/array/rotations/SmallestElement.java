package array.rotations;

public class SmallestElement {

	/*Function to return smallest element in array*/
	public static int smallest(int arr[]) {
		int min = arr[0];
		int index = 0;
		for(int i= 1; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		System.out.println("Smallest element in the array is " + min + " at index "+index);
		return min;	
	}

	public static void main(String[] args) {
		int arr[] = {15,18,2,3,6,12};
		int arr1[] = {7,9,11,12,15};
		int arr2[] = {7,9,11,12,5};
		smallest(arr1);
	}
}
