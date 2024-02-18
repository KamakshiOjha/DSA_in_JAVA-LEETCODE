// leetcode - 70. Climbing Stairs

//...time exceeds for large problem

import java.util.*;
public class Climbing_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    
    public static int count(int n)
    {
        if(n<=1){
            return 1;
        }
        return count(n-1) + count(n-2);
    }
}
