package javaCode.sh;
public  class ReverseString{
	
    public static void main(String[] args) {
        String str = "shobhit";
     System.out.println(reverseString(str));
    }
    
    public static String reverseString(String s){
    StringBuilder k = new StringBuilder(s);
    return k.reverse().toString();
    }

    
}