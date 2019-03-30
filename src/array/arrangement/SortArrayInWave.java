package array.arrangement;

import java.util.Arrays;

import sorting.SelectionSort;

public class SortArrayInWave {
	
	public static void sortInWave(int arr[]) {
		SelectionSort.sort(arr);
		SwapArray.swap(arr);
	}
	public static void main(String[] args) {
		int arr[] = {10,90,49,2,1,5,23};
		System.out.println("Original Array : " + Arrays.toString(arr));
		sortInWave(arr);
		System.out.println("Sorted Array In Wave :" + Arrays.toString(arr));
	}
}
