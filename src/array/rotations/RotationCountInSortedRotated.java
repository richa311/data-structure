package array.rotations;

public class RotationCountInSortedRotated {

	/*Function to return index of largest element in array*/
	public static int largest(int arr[]) {
		int max = arr[0];
		int index = 0;
		for(int i= 1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Largest element in the array is " + max);
		return index;	
	}

	/*Function to return number of rotation count, array is rotated clockwise*/
	public static int countRotation(int arr[]) {
		int index = largest(arr);

		if (index == arr.length-1)
			return 0;
		else
		return index+1;		
	}

	public static void main(String[] args) {
		int arr[] = {15,18,2,3,6,12};
		int arr1[] = {7,9,11,12,15};
		int arr2[] = {7,9,11,12,5};
		int count = countRotation(arr2);
		System.out.println("Rotation Count is " +count);
	}

}
