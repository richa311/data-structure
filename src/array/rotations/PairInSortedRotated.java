package array.rotations;

public class PairInSortedRotated {
	
	/*Function to check if pair with the input sum is present in the sorted array*/
	public static boolean isPairPresent(int arr[], int x) {
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length ; j++) {
				temp = arr[i]+arr[j];
				if (temp == x) {
					return true;
				}	
			}		
		}
		return false;	
	}

	public static void main(String[] args) {
		int arr[] = {11,15,26,38,9,10};
		int x = 45;
		boolean result = isPairPresent(arr, x);
		System.out.println("Is present in the Array with Max Sum " + x + ": "+ result);
	}

}
