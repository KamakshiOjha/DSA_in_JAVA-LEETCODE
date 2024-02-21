// leetcode - 451. Sort Characters By Frequency
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort_Char {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        // String [] str = s.split();
        int n = s.length();
        HashMap<Character,Integer> h = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        int max = Integer.MIN_VALUE;
        StringBuilder arr = new StringBuilder();
        for(int i = n;i>0;i--){
            for(Map.Entry<Character,Integer> entry : h.entrySet()){
                if(i == entry.getValue()){
                    for(int j = 0;j<i;j++){
                        arr.append(entry.getKey());
                    }
                }else{
                    continue;
                }
            }
        }

        return arr.toString();
    }
}
