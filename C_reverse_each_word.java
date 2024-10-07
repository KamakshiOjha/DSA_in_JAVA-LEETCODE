
public class Solution {

	public static String reverseEachWord(String str) {
		String s[] = str.split(" ");
		for(int i = 0;i<s.length;i++){
			s[i] = reverse(s[i],0,s[i].length()-1);
		}
		return String.join(" ",s);
	}
	public static String reverse(String s,int start,int end){
		String str[] = s.split("");
		while(start<end){
			String temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		return String.join("",str);
	}

}
