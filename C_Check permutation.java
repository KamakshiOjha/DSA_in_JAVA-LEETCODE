import java.util.*;
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		if(str1.length() !=str2.length()){
			return false;
		}
		HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (!charCount.containsKey(c)) {
                return false; 
            }charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);  
            }
			};
		return charCount.isEmpty();
		// int count= 0;
		// for(int i = 0;i<str1.length();i++){
		// 	for(int j = 0;j<str2.length();j++){
		// 		if(str1.charAt(i) == str2.charAt(j)){
		// 			count++;
		// 		}
		// 		else if(count ==str1.length() ){
		// 			return true;
		// 		}
		// 	}
		// }
		
		// return false;
	}

}
