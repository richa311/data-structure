package array.rotations;

import java.util.Arrays;

public class RotateByOne {
	
	/*Function to cyclically rotate array by one*/
	public static void rotate() {

		int arr[]= {1,2,3,4,5};
		System.out.print(Arrays.toString(arr));

		int temp,i;
		temp = arr[arr.length -1];

		for(i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1]; 
		}
		arr[0] = temp;
		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		rotate();
	}

}
