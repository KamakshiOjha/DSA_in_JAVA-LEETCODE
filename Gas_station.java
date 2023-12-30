// leetcode - 134. Gas Station
import java.util.Arrays;

public class Gas_station {
    public static void main(String[] args) {
        int []gas = {3,5,2,1,7};
        int []cost = {4,2,1,9,1};
        System.out.println(canCompleteCircuit(gas, cost) + "TH STATION"+ " = " + gas[canCompleteCircuit(gas, cost)]);
        
    }   
    //First approach
    // public static int canCompleteCircuit(int[] gas, int[] cost) {
    //     int rep = 2;
    //     int n0 = gas.length;
    //     int []gas1 = Arrays.copyOf(gas, gas.length * rep);
    //     int []cost1 = Arrays.copyOf(cost, cost.length * rep);
    //     int n = gas1.length;
    //     int curr = 0;
    //     int start = 0;
    //     for(int i = 0;i<n;i++){
    //         if(i==start+n0){
    //             return start;
    //         }
    //         curr = curr + gas1[i] - cost1[i];
    //         if(curr<0){
    //             start = i+1;
    //             curr = 0;
    //         }

    //     }
    //     return start;
    // }
    //optimised way
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int curr = 0;
        int total = 0;
        int start = 0;
        for(int i = 0;i<n;i++){
            curr += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(curr<0){
                start = i+1;
                curr = 0;
            }

        }
        if(total<0){
            return -1;
        }
        return start;
    }
}
