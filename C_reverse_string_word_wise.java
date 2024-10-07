import java.util.*;
public class Solution {
	public static String reverseWordWise(String input) {
		String str [] = input.split(" ");
		int start = 0;
		int end = str.length-1;
		while(start<end){
			String temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		String s = String.join(" ",str);
		return s;

	}
}
