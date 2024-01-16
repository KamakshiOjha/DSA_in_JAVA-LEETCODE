// leetcode - 2225. Find Players With Zero or One Losses
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zero_or_One_Losses {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        findWinners(matches);
    }
    public static void findWinners(int[][] matches) {
        List<List<Integer>> arr = new ArrayList();
        HashMap<Integer,Integer> win = new HashMap<>();
        HashMap<Integer,Integer> loss = new HashMap<>();
        int row = matches.length;
        int colm = matches[0].length;
        for(int i = 0;i<row;i++){
            if(!win.containsKey(matches[i][0])){
                win.put(matches[i][0],1);
            }else{
                win.put(matches[i][0],win.getOrDefault(matches[i][0], 0) + 1);
            }
        }
        for(int i = 0;i<row;i++){
            if(!loss.containsKey(matches[i][1])){
                loss.put(matches[i][1],1);
            }else{
                loss.put(matches[i][1],loss.getOrDefault(matches[i][1], 0) + 1);
            }
        }
        List<Integer> part1 = new ArrayList();
        for(int i : win.keySet()){
            if(!loss.containsKey(i)){
                part1.add(i);
        }
        }
        
        List<Integer> part2 = new ArrayList();
        for(int i : loss.keySet()){
            if (loss.get(i) == 1) {
                part2.add(i);
            }
        }
        arr.add(part1);
        arr.add(part2);
        for(int i:part1){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for(int i:part2){
            System.out.print(i + " ");
        }
    }
    // A bit optimised:
    // public List<List<Integer>> findWinners(int[][] matches) {
    //     List<List<Integer>> arr = new ArrayList();
    //     HashMap<Integer,Integer> win = new HashMap<>();
    //     HashMap<Integer,Integer> loss = new HashMap<>();
    //     int row = matches.length;
    //     int colm = matches[0].length;
    //     for(int i = 0;i<row;i++){
    //         win.put(matches[i][0],win.getOrDefault(matches[i][0], 0) + 1);
    //         loss.put(matches[i][1],loss.getOrDefault(matches[i][1], 0) + 1);
    //     }
    //     List<Integer> part1 = new ArrayList(win.keySet());
    //     part1.removeAll(loss.keySet());
        
    //     List<Integer> part2 = new ArrayList();
    //     for(Map.Entry<Integer,Integer> entry : loss.entrySet()){
    //         if (entry.getValue() == 1) {
    //             part2.add(entry.getKey());
    //         }
    //     }
    //     arr.add(part1);
    //     arr.add(part2);
    //     return arr;
    // }

    //more optimised :
    // public List<List<Integer>> findWinners(int[][] matches) {
    //     List<List<Integer>> arr = new ArrayList();
    //     HashMap<Integer,Integer> loss = new HashMap<>();
    //     int row = matches.length;
    //     int colm = matches[0].length;
    //     for(int i = 0;i<row;i++){
    //         loss.put(matches[i][1],loss.getOrDefault(matches[i][1], 0) + 1);
    //     }
    //     List<Integer> part1 = new ArrayList();
    //     List<Integer> part2 = new ArrayList();
    //     for(int i =0;i<row;i++){
    //         int val = matches[i][0];
    //         if(!loss.containsKey(val) && !part1.contains(val) ){
    //             part1.add(matches[i][0]);
    //         }
    //     }
    //     for (Map.Entry<Integer, Integer> entry : loss.entrySet()){
    //         if(entry.getValue().equals(1)){
    //             part2.add(entry.getKey());
    //         }
    //     }
    //     Collections.sort(part1);
    //     Collections.sort(part2);
    //     arr.add(part1);
    //     arr.add(part2);
    //     return arr;
    // }
}
