//leetcode - Merge Strings Alternately
import java.util.ArrayList;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        String[] w1 = word1.split("");
        String[] w2 = word2.split("");
        int n = w1.length;
        int m = w2.length;
        int min = Math.min(n,m);
        ArrayList<String> stringList = new ArrayList<>();
        
            for(int i=0;i<min;i++){
                stringList.add(w1[i]);
                stringList.add(w2[i]);
            }
        
        for (int i = min; i < n; i++) {
            stringList.add(w1[i]);
        }
        for (int i = min; i < m; i++) {
            stringList.add(w2[i]);
        }

        StringBuilder merge = new StringBuilder();
        for(String i : stringList){
            merge.append(i);
        }
        
    return merge.toString();
    }
}
