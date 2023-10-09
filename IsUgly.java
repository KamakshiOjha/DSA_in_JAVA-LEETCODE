import java.util.Scanner;

public class IsUgly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        int n = sc.nextInt();
        System.out.println(isUgly(n));

    }
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] divisors = {2, 3, 5};
        for (int divisor : divisors) {
            while (n % divisor == 0) {
                n /= divisor;
            }
        }
        return n == 1;
    }
}
