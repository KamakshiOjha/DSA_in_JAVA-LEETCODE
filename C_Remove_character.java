
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		StringBuffer s = new StringBuffer();
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) !=ch){
				s.append(str.charAt(i));
			}
		}
		return s.toString();
	}

}
