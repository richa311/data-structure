package array.arrangement;

import java.util.Arrays;

public class SwapArray {

	public static void swap(int arr[]) {
		int i,temp;
		for (i =0; i<arr.length-1; i += 2) {
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,9,10,12};
		System.out.println("Original Array : " + Arrays.toString(arr));
		swap(arr);
		System.out.println("Array after swapping : " + Arrays.toString(arr));

	}

}
