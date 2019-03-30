package array.basic;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int miss = ++arr[i];
			if(arr[i+1] != miss)
				return miss;
			
		}
		return 0;
	}
}
