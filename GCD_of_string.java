//leetcode - Greatest Common Divisor of Strings
//For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

// for large test case might not work.
public class GCD_of_string {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder s = new StringBuilder();
        int n = str1.length();
        int m = str2.length();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(str1.charAt(i)==str2.charAt(j)){
                s.append(str1.charAt(i));
                i++;
                j++;
            }
            else {
                break; 
            }
        }
        for(int k = 0;k<s.length();k++){
            for(int l = k+1 ;l<s.length();l++){
                if(s.charAt(k) == s.charAt(l)){
                    s.deleteCharAt(l);
                }
            }
            
        }
        return s.toString();
        
    }
}
