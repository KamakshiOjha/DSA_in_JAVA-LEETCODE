// leetcode - 342. Power of Four
public class Power_of_Four {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }

        while(n > 1){
            if(n % 4 != 0){
                return false;
            }
            n /= 4;
        }
        return n == 1;
    }
}
