class Solution {
    public static boolean palinArray(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            if (!ispalindrome(Integer.toString(arr[i]))) {
                return false; // If any number is not a palindrome, return false
            }
        }
        return true;
        
    }
    public static boolean ispalindrome(String s){
        int end = s.length()-1;
        int start = 0;
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
