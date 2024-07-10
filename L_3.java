import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int l = 0;
        int result = 0;
        for(int i =0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l += 1;
            }
            set.add(s.charAt(i));
            result = Math.max(result, i-l+1);
        }
        return result;
    }
}
