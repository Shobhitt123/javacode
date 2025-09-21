package javaCode;

import java.util.HashSet;

public class FirstRepeatingChar_1 {   // Problem : First Letter to Appear Twice - Looking backward

	public static void main(String[] args) {
		
		String str = "abndsfba";
		System.out.println(firstRepeatingchar(str));

	}
	
	public static char firstRepeatingchar (String str) {
		
		char arr[] = str.toCharArray();		
		
		HashSet<Character> set = new HashSet<>(); // Storing unique characters in hashset 
		
		for(int i=0;i<str.length();i++) {			// Traversing array
			
			char ch = arr[i];
			if(set.contains(ch)) {
				return ch;					// Return as current character is already present in hashset 
			}
			else {				
				set.add(ch);			// add character in hashset
			}			
		}
		
		return 0;					// return 0 if no repeating character found
	}

}
