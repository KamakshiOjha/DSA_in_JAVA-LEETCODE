class Solution {
    public int minimumDeletions(String s) {
        int a_count_right = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a_count_right++;
            }
            
        }
        int b_left = 0;
        int result = s.length();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a_count_right--;
            }
            result = Math.min(result, (b_left+a_count_right));
            if(s.charAt(i) == 'b'){
                b_left++;
            }
        }
        return result;

    }
}
