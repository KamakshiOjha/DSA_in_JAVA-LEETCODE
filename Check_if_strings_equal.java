//leetcode - 1657. Determine if Two Strings Are Close
import java.util.HashMap;

public class Check_if_strings_equal {
    public static void main(String[] args) {
        String word1 = "abcaabcb";
        String word2 = "bccaaabb";
        System.out.println("Find if string 1 can be made using string 2 after manipulation : " + closeStrings(word1, word2));
    }
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        for(int i =0;i<word1.length();i++){
            if(!h1.containsKey(word1.charAt(i))){
                h1.put(word1.charAt(i),h1.get(word1.charAt(i)+1));
            }
            else{
                h1.put(word1.charAt(i),1);
            }
        }
        for(int i =0;i<word2.length();i++){
            if(!h2.containsKey(word2.charAt(i))){
                h2.put(word2.charAt(i),h2.get(word2.charAt(i)+1));
            }
            else{
                h2.put(word2.charAt(i),1);
            }
        }
        if(!h1.keySet().equals(h2.keySet())){
            return false;
        }
        if(h1.equals(h2) ){
            return true;
        }
         
        return false;

    }
}
