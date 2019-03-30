package array.arrangement;

import java.util.Arrays;

public class RearrangeNumbers {

	public static void rearrangeRandom(int arr[]) {

		int temp = 0,i=-1;
		for(int j = 0; j<arr.length; j++) {
			if(arr[j] < 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}			
		}	
	}

	public static void rearrangeInOrder(int arr[]) {
		int temp,j;
		for(int i=1;i<arr.length;i++) {
			temp = arr[i];
			if (temp>0)
				continue;
			j = i-1;
			while(j>=0 && arr[j]>0) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
		System.out.println("Original Array : " + Arrays.toString(arr));
		//rearrangeRandom(arr);
		//System.out.println("Array after random rearranging : " + Arrays.toString(arr));
		rearrangeInOrder(arr);
		System.out.println("Array In order : " + Arrays.toString(arr));
	}

}
