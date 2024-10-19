class Solution {
    public char findKthBit(int n, int k) {
        String s = generateSn(n);
        return s.charAt(k - 1);
    }
    public String generateSn(int n) {
        if (n == 1) {
            return "0";
        }
        String prev = generateSn(n - 1);
        String inverted = invert(prev);
        String reversed = reverse(inverted);
        return prev + "1" + reversed;
    }
    public static String invert(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c == '1' ? '0' : '1');
        }
        return sb.toString();
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    // public static String invert(String s){
    //     String st = "";
    //     if(s.charAt(0) == '1'){
    //         st += "0";
    //     }else{
    //         st+="1";
    //     }
    //     if (s.length() > 1) {
    //         st += invert(s.substring(1));
    //     }
    //     return st;
    // }
    // public static String reverse(String s){
    //     if (s.length() <= 1) {
    //     return s;
    //     }
    //     return reverse(s.substring(1)) + s.charAt(0);
    // }
}
