package javaCode;

import java.util.HashMap; // Problem: First Unique Character in a String

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "applae";
        System.out.println(firstNonrepeatingchar(str)); // Calling function and printing char
    }

    public static char firstNonrepeatingchar(String str) {

        char arr[] = str.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>(); // storing character & their count

        // Traversing array & calculating occurrence
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (hm.containsKey(ch)) { // check if character present in hashmap
                hm.put(ch, hm.getOrDefault(ch, 0) + 1); // Increase count by 1
            } else {
                hm.put(ch, 1); // if not present, put with count as 1
            }
        }

        // Find first non-repeating character
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (hm.get(ch) == 1) { // character having count 1 will be non-repeating character
                return ch; // return character
            }
        }

        return 0; // if no non-repeating character found
    }
}
