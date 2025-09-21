package javaCode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println((groupAnagrams(strs).toString())); // calling function & printing list as string 

	}

	public static List<List<String>> groupAnagrams(String[] strs){
				
	       
	        HashMap<String,List<String>> hm = new HashMap<>();		// sorted string as key 
	        														//and original string as value
	        for(String s : strs)
	        {
	            char arr[]= s.toCharArray();	// converting string to array for sorting it 
	            Arrays.sort(arr);				//  Sorted array
	            String temp = new String(arr);  // sorted array to string -> key in hashmap
	            
	            if(hm.containsKey(temp))		// if key exists, add word to list  
	            {
	                hm.get(temp).add(s);
	            }
	            else							// else create new list with word  
	            {
	                List<String> l = new ArrayList<>();
	                l.add(s);
	                hm.put(temp,l);
	            }
	        }
	        
	        List<List<String>> ans = new ArrayList<>();		// final grouped result  
	        
	        for(String s : hm.keySet())					// add all lists from hashmap to result 
	        {
	            ans.add(hm.get(s));
	        }
	        
	        return ans;								// return grouped anagrams
	    
		
	}
}
