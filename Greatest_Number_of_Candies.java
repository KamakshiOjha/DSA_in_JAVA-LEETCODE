// Leetcode  - Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.List;

public class Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> result = kidsWithCandies(candies,extraCandies);
        for(boolean i : result){
            System.out.print(i + " ");
        }
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        List<Boolean> result = new ArrayList<>();
        for(int i : candies){
            if(i>max){
                max = i;
            }
        }
        for(int i : candies){
            if(i + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
