package javaCode;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		
		int[] nums = {-3,2,7,0,-4,2,-5,0,8,3,-1};  		// -3,2,7,0,-4,2,-5,0,8,3,-1   2,3,-2,4
		
		System.out.println(MaxProductsubarray(nums));	// Calling function & printing 
	}
	
	public static int MaxProductsubarray(int[] nums ) {
		
		int minPrice = nums[0];					// smallest product ending at current index
		int maxPrice = nums[0];					// Maximum product ending at current index	
		
		int result = Integer.MIN_VALUE;			// Final result (maximum product found so far)
		
		for(int i=1;i<nums.length;i++) {		// Start loop from second element
			
			int curr = nums[i];					// Current element in array
			
			int temp = minPrice;				// Store previous minPrice before updating it
			
			// Update minPrice:
			// Take the minimum of (current element) OR (current * previous max) OR (current * previous min)
	        // Why? Because a negative number * negative min can become a positive max in future.
			
			minPrice = Math.min(curr, Math.min(maxPrice*curr, minPrice*curr));
			
			// Update maxPrice:
	        // Take the maximum of (current element) OR (current * previous max) OR (current * previous min)
	        // This ensures we track the largest product possible at this index.
			
			maxPrice = Math.max(curr, Math.max(maxPrice*curr,temp*curr));
					
			if (maxPrice > result)   // Update result with the best product found so far
			{
				result = maxPrice;
			}
			
		}
		
		return result;			// Returning the maximum product subarray
	}
}
