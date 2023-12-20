//  leetcode - 2706. Buy Two Chocolates
import java.util.Arrays;

public class Buy_Two_Chocolates {
    public static void main(String[] args) {
        int []prices = {1,2,2};
        int money = 3;
        System.out.println(buyChoco(prices,money));
    }
    public static int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int count = 0;

        int M = money;
        Arrays.sort(prices);
        for(int i = 0;i<n && count<2;i++){
            if(prices[i]<=money){
                money = money - prices[i];
                count++;
            }
        }
        if(count == 1){
            return M;
        }
        return money;
    }
}
