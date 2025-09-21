package javaCode;

public class SellStock {

	public static void main(String[] args) {
		
		int arr[] = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));		// calling function & printing the maximum profit
	}
	
	public static int maxProfit(int[] arr) {

        int profit = 0 ;             // Maximum profit 
        int cp = arr[0] ;            // Cost price of stocks
        
        for(int i=0;i<arr.length;i++){

            int diff = 0 ;          // profit ( difference of sp - cp )
            int mp = arr[i];        // Market price / current price

            if(mp > cp)              // market price > cost price -> Profit
            {
                diff = mp-cp;        // calculating profit
                profit = Math.max(profit , diff);   // Maximum profit
            }
            else if(mp < cp )         // when Market price < cost price
            {
                cp = mp ;             // updating cost price 
            }
        }
        return profit;
    }
}
