class Solution {
    public boolean isCircularSentence(String sentence) {

        String s[] = sentence.split(" ");
        // if(s.length == 1 && s[0].charAt(0)!= s[0].charAt(s.length-1)){
        //     return false;
        // } 

        for(int i = 1;i<s.length;i++){
            String str = s[i-1];
            if(str.charAt(str.length()-1) != s[i].charAt(0)){
                return false;
            }
        }
        return s[s.length - 1].charAt(s[s.length - 1].length() - 1) == s[0].charAt(0);

    }
}
