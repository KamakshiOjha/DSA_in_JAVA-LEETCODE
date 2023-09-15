//leetcode - Valid Anagram - Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
import java.util.Arrays;

public class  valid_string{
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for(int i = 0;i<sArray.length;i++){
            if(sArray[i] != tArray[i]){
                return false;
            }
        }
        return true;

    }
}
