import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Fractional_knapsack {
    public static void main(String[] args) {
        int[] values = {100, 280, 120,120};
        int [] weights = {10,40,20,24};
        int capacity = 60;
        Knapsack(values, weights, capacity);
        
    }

    public static void Knapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        double[] ratio = new double[n]; 
        ArrayList<Integer> resultant = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) values[i] / weights[i];
        }
    
        Integer[] track_original = new Integer[n];
        for (int i = 0; i < n; i++) {
            track_original[i] = i;
        }
        Arrays.sort(track_original, Comparator.comparingDouble(i -> -ratio[i]));
    
        int i = 0;
        
        while (capacity > 0 && i < n) {
            int item = track_original[i];
            if (capacity >= weights[item]) {
                resultant.add(weights[item]);
                capacity -= weights[item];
            } else {
                double fraction = (double) capacity / weights[item];
                int val = (int) (fraction * weights[item]); 
                capacity = capacity - val;
                resultant.add(val);
            }
            i++;
        }
        System.out.println("weights added in bag:");
        for (int val : resultant) {
            System.out.println(val);
        }
        System.out.println("Values added in the bag:");
        int totalValue = 0;
        for (i = 0; i < resultant.size(); i++) {
            totalValue += resultant.get(i) * (values[track_original[i]] / weights[track_original[i]]);
            System.out.println(resultant.get(i) * (values[track_original[i]] / weights[track_original[i]]));
        }

        System.out.println("Total Value in the bag: " + totalValue);
    }
    
}
