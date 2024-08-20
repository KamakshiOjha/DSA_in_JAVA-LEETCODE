class Solution {
    public int scoreOfString(String s) {
        if(s.length() == 1){
            return (int)s.charAt(0);
        }
        int n = s.length();
        int current = s.charAt(1);
        int prev =  s.charAt(0);
        int count = Math.abs(current-prev);
        for(int i = 2;i<n;i++){
            current = s.charAt(i);
            prev = s.charAt(i-1);
            count+= Math.abs(current-prev);
        }
        return count;
    }
}
