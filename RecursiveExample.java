import java.util.*;

public class RecursiveExcample{
    public static void main(String[] args){
        System.out.println(isPalindrome("madame"));
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String s){
        //base case, trivially true for empty & 1-letter string
        if(s.length() < 2){
            return true;
        }
        else{
            return s.charAt(0) == s.charAt(s.length()-1) && isPalindrome(s.substring(1, s.length()-1));
        }
    }
}