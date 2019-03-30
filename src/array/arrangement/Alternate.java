package array.arrangement;

import java.util.Arrays;

public class Alternate {
	
	public static void rearrange(int arr[]) {
		
		int temp = 0,i=-1;
		for(int j = 0; j<arr.length; j++) {
			if(arr[j] < 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}			
		}
		int pos = i+1, neg = 0;
		while(pos<arr.length && neg<pos && arr[neg]<0) {
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			pos++;
			neg += 2;
		}
	}

	public static void main(String[] args) {
		int arr[] = {-1,2,-3,4,5,6,-7,8,9};
		int arr1[] = {-12,11,-13,-5,6,-7,5,-3,-6};
		System.out.println("Original Array : " + Arrays.toString(arr1));
		rearrange(arr);
		System.out.println("Array after rearranging : " + Arrays.toString(arr1));
	}
}
