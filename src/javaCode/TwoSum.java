package javaCode;

import java.util.*;

//Problem: Two Sum – Find indices of two numbers in an array that add up to a target value.

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 5, 3, 9, 8 }; 	// Input array
		int target = 11; 							// target sum
		
		// Call twoSum() and print result as string for readability
		
		System.out.println(Arrays.toString(twoSum(arr, target))); 
																  
	}

	public static int[] twoSum(int[] arr, int target) {
		
		// HashMap to Store number and their index as key & Value

		HashMap<Integer, Integer> hm = new HashMap<>(); 
		
		// Traversing array

		for (int i = 0; i < arr.length; i++) {
			
			// For each element, calculate the required complement

			int SecondNum = target - arr[i];  
			
			// if second number already exist in hashmap return indices

			if (hm.containsKey(SecondNum)) { 

				return new int[] { hm.get(SecondNum), i };
			}

			hm.put(arr[i], i); // Otherwise, store current number with its index

		}

		return new int[] {}; // If no valid pair is found, return an empty array

	}

}
