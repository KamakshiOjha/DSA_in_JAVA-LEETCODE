// leetcode - 1758. Minimum Changes To Make Alternating Binary String
public class Minimum_Charges {
    public static void main(String[] args) {
        String s = "0100";
        System.out.println(minOperations(s));

    }
    public static int minOperations(String s) {
        int count = 0;
        int n = s.length();
        String [] temp = s.split("");

        for(int i = 0;i<n;i++){
            if(i%2 == 0){
                if("1".equals(temp[i])){
                    count++;
                }
            }else{
                if("0".equals(temp[i])){
                    count++;
                }
            }

        }


     return Math.min(count, s.length()-count);
    }
}
