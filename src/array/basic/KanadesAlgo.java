package array.basic;

public class KanadesAlgo {

	public static void main(String[] args) {
		int arr[]= {5,-2,-1,-3,4};
		System.out.println(maxSumofSubstring(arr));
	}
	
	public static int maxSumofSubstring(int arr[]) {
		int size = arr.length;
		int max = Integer.MIN_VALUE;
		int maxSum = 0;
		for(int i = 0;i<size;i++) {
			maxSum = maxSum + arr[i];
			if(max<maxSum) 
				max = maxSum;
			if(maxSum<0)
				maxSum = 0;
		}
		return max;	
	}
}
