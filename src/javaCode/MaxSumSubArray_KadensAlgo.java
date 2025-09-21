package javaCode;

public class MaxSumSubArray_KadensAlgo {	  // Problem : Find Maximum sum sub array ( Kaden's Algorithm )

	public static void main(String[] args) {
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaxSum(arr));			// Function calling and printing Maximum sum
	}

	public static int MaxSum(int[] nums) {			// Function calculating Maximum sum

		int currSum = 0;
		int MaxSum = 0;

		for (int i = 0; i < nums.length; i++) {		// Traversing array -> O(n)

			currSum = nums[i] + currSum;			// Calculating sum of the subarray

			if (currSum > MaxSum) {					// Updating MaxSum when CurrSum has Greater value
				MaxSum = currSum;
			}

			if (currSum < 0) {						// Updating currSum to 0 when -ve value found  
				currSum = 0;
			}
		}
		return MaxSum;								// Returning Maximum sum 

	}
}
