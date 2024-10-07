
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		StringBuilder output = new StringBuilder();
        if (str.length() == 0) {
            return ""; 
        }
        output.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
				output.append(str.charAt(i));
			}
	}
		return output.toString();

}}
