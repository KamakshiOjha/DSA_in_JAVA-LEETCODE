//leetcode - 49. Group Anagrams
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public static void main(String[] args) {
        String []strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> a = groupAnagrams(strs);
        for(List<String> list : a){
            for(String str : list){
                System.out.print(str + " ");
            }
            System.out.println("\n");
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(String s : strs){
            char []c = s.toCharArray();
            Arrays.sort(c);
            String sortedArray = String.valueOf(c);
            if(!group.containsKey(sortedArray)){
                group.put(sortedArray, new ArrayList<>());
            }group.get(sortedArray).add(s);
        }
        return new ArrayList<>(group.values());
    }
}
