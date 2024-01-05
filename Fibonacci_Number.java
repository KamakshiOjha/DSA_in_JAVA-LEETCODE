// leetcode - 509. Fibonacci Number
import java.util.*;
public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int count = 2;
        int c = 0;
        if(n == 0 || n==1){
            return n;
        }
        while(count<=n){
            c = a+b;
            a = b;
            b = c;
            count++;
        }
        return c;
    }
}
