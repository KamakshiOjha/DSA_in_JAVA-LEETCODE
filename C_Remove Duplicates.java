public class Solution {
    public static String removeConsecutiveDuplicates(String s) {
        if(s.length() == 0){
            return s;
        }
        String str = removeConsecutiveDuplicates(s.substring(1));
        if(str.length() > 0 && str.charAt(0)== s.charAt(0)){
            return str;
        }else{
            return s.charAt(0) + str;
        }

    }

}
