package array.basic;

public class SubArrayWithSum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,10};
		int givenSum = 7;
		System.out.println(subArrayWithGivenSum(arr, givenSum));

	}
	
	public static boolean subArrayWithGivenSum(int arr[], int givenSum) {
		int sum =0;
		for(int i = 0; i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				sum = sum + arr[i];
				if(sum == givenSum)
					return true;
			}
		}
		return false;
	}
}
