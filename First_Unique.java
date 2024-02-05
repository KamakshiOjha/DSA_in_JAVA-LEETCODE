//387. First Unique Character in a String
import java.util.HashMap;
import java.util.Map;

public class First_Unique {
    public static void main(String[] args) {
        String s = "leeolttcocded";
        System.out.println(firstUniqChar(s));
    }
    // public static int firstUniqChar(String s) {
    //     String []str = s.split("");
    //     int n = str.length;
    //     HashMap<String,Integer> count = new HashMap<>();
    //     HashMap<String,Integer> index = new HashMap<>();

    //     for(int i = 0;i<n;i++){
    //         count.put(str[i],count.getOrDefault(str[i],0)+1);
    //         index.put(str[i],i);
    //     }
    //     int min = Integer.MAX_VALUE;
    //     boolean b= false;
    //     for(Map.Entry<String,Integer> entry : count.entrySet()){
    //         if(entry.getValue() == 1){
    //             min = Math.min(min,index.get(entry.getKey()));
    //             b = true;
    //         }
    //     }
    //     if(b==false){
    //         return -1;
    //     }
    //     return min;
        
    // }
    // optimised
    public static int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i = 0;i<n;i++){ 
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }
        int min = Integer.MAX_VALUE;
        boolean b= false;
        for(Map.Entry<Character,Integer> entry : count.entrySet()){
            if(entry.getValue() == 1){
                min = Math.min(min,s.indexOf(entry.getKey()));
                b = true;
            }
        }
        if(b==false){
            return -1;
        }
        return min;
    }
}
