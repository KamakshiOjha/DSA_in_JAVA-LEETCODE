class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        long result = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++; 
            }else{
                result += count;
            }
        }
        return result;
    //     StringBuffer str = new StringBuffer(s);
    //     int start = 0;
    //     int end = start+1;
    //     long count = 0;
    //     while(end<s.length()){
    //         if(str.charAt(start) == '1' && str.charAt(end) == '0'){
    //             swap(str, start,end);
    //             count++;
    //             end++;
    //             start++;
    //         }else if(str.charAt(end) == '1'){
    //             end++;
    //         }else if(str.charAt(end) == '0'){
    //             start++;
    //         }
    //     }
    //     return count;
    // }
    // public static void swap(StringBuffer str,int start,int end){
    //     char ch = str.charAt(start);
    //     str.setCharAt(start, str.charAt(end));
    //     str.setCharAt(end, ch);
    }
}
