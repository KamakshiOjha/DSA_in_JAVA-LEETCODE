//leetcode - its somewhat giving wrong answer

public class Is_Subsequence {
    public static void main(String[] args) {
        String s = "abcdefg";
        String t = "acd";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
