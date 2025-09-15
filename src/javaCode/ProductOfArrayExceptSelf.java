package javaCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3};
		System.out.println(Arrays.toString(pAES(arr)));
	}

	public static int[] pAES(int arr[]) {

		int n = arr.length;
		int suffix[] = new int[n];
		int prifix[] = new int[n];
		int ans[] = new int[n];
		//hi this is shobhit
		prifix[0] = 1;
		for(int i=1; i<n; i++) {
			prifix[i] = prifix[i-1] * arr[i-1];
		}
		
		suffix[n-1] = 1;
		for(int i = n-2; i>=0; i--) {
			suffix[i] = suffix[i+1] * arr[i+1];
		}
		for(int i = 0; i<n; i++) {
			ans[i] = prifix[i]*suffix[i];
		}
		return ans;
	}
}
