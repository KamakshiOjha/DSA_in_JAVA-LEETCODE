//leetcode - Best Time to Buy and Sell Stock.

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=1){
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        for(int i = 0;i<n;i++){
            int current = prices[i];
            if(min>prices[i]){
                min = prices[i];
            }
            else{
                int max = current - min;
                if(max > profit){
                    profit = max;
                }
            }

        
    }
    return profit;
}
}



//this code is correct but will not work for [2,4,1] type of cases.
// import java.util.*;
// class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int min = prices[0];
//         int  x= 0;
//         int profit = 0;
//         for(int i = 0;i<n;i++){
//             if(min>prices[i]){
//                 min = prices[i];
//                 x = i; 
//             }
//         }
//         int max = min;
//         for(int j = x;j<n;j++){
//             if(max<prices[j]){
//                 max = prices[j];
//             }
//         }
//         int secmin = Integer.MAX_VALUE;  
//         if(max == min){
//             profit = 0;
//             for(int i = 0;i<n;i++){
//                 if(prices[i] != min && prices[i] < secmin)
//                 secmin = prices[i];
//                 x = i;
                
//             }
//             max = secmin; 
//             for(int j = x;j<n;j++){
//             if(max<prices[j]){
//                 max = prices[j];
//                 }
//             }
//             profit = max - secmin;
//             return profit;
//         }
//         profit = max - min;
//         return profit;
        
//     }
// }
