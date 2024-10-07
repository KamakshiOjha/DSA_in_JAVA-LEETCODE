import java.util.*;

public class Solution {

	public static char highestOccuringChar(String str) {
		HashMap<Character,Integer> hash = new HashMap<>();
		for(int i = 0;i<str.length();i++){
			hash.put(str.charAt(i),hash.getOrDefault(str.charAt(i),0)+1);
		}
		int max = Integer.MIN_VALUE;
		char key = '\0';
		for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
			if(max<entry.getValue()){
				max = entry.getValue();
				 key = entry.getKey();
			}
		}
		return key;
	}

}
