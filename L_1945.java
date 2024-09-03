class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(char c: s.toCharArray()){
            int value = c - 'a'+1;
            str.append(value);
        }

        String num = str.toString();
        for(int i = 0;i<k;i++){
            num = sum(num);
        }
        return Integer.parseInt(num);
    }
    public static String sum(String num){
        int sum1 = 0;
        for(int i = 0;i<num.length();i++){
            sum1 += num.charAt(i) - '0';
        }
        return Integer.toString(sum1);
    }
}
