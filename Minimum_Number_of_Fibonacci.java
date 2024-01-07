//leetcode - 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
import java.util.ArrayList;
import java.util.*;

public class Minimum_Number_of_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int k = sc.nextInt();
        // System.out.println(findMinFibonacciNumbers(k));
        ArrayList<Integer> result = new ArrayList<>();
        result = findMinFibonacciNumbers(k);
        System.out.print("[");
        for(int i = 0;i<result.size();i++){
            System.out.print(result.get(i) + " ");
        }
        System.out.print("]");
    }
    public static ArrayList<Integer> findMinFibonacciNumbers(int k) {
        int a = 1;
        int b = 1;
        int c = 0;
        int count = 2;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        while(c<=k){
            c = a+b;
            arr.add(c);
            a = b;
            b = c;
        }
        int current = k;
        int total = 0;
        for(int i = arr.size()-1 ; i>=0;i--){
            if(current >= arr.get(i)){
                current = current - arr.get(i);
                result.add(arr.get(i));
                total++;
            }
            
        }
        return result;
        
    }
}
