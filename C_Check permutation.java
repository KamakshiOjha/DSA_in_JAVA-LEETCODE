
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		if(str1.length() !=str2.length()){
			return false;
		}
		int count= 0;
		for(int i = 0;i<str1.length();i++){
			for(int j = 0;j<str2.length();j++){
				if(str1.charAt(i) == str2.charAt(j)){
					count++;
				}
				else if(count ==str1.length() ){
					return true;
				}
			}
		}
		
		return false;
	}

}
