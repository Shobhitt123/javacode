package javaCode;

import java.util.HashMap;

public class Valid_Anagram {

	public static void main(String[] args) {
		
		String str1 = "silenta";
		String str2 = "listena";
		
		if(ValidAnagram(str1,str2)) {
			System.out.println("Given two string are Anagram.");
		}else {
			System.out.println("Given two strings are not Anagram.");
		}

	}
	
	public static boolean ValidAnagram( String str1 , String str2) {
		
		int l1 = str1.length();
		int l2 = str2.length();
		
		if(l1 != l2)					// if string lengths differs, not an anagram - considering space 
			return false;
		
		char[] freq = new char[26];		// frequency array for lowercase letters
		
		for(char c : str1.toCharArray() ) { freq[c-'a']++; }		// count chars in str1
		for(char c : str2.toCharArray() ) { freq[c-'a']--; }		// Subtract chars in str2
		
		for(int count : freq) { if(count != 0 ) return false;}		// Mismatch found
		
		return true;				   // All count 0 -> Valid anagram 
	}
}
