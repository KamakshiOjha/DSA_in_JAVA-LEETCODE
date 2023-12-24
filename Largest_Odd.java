// leetcode - 1903. Largest Odd Number in String
public class Largest_Odd {
    public static void main(String[] args) {
        String num = "35427";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))%2==1){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
