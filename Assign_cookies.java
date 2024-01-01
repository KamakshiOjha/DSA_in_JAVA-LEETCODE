// 455 - Assign Cookies
import java.util.Arrays;

public class Assign_cookies {
    public static void main(String[] args) {
        int [] g = {1,2,3,9,10,2,3,5};
        int [] s = {3,2,1,6,4,6};
        System.out.println(findContentChildren(g, s));

    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greed = 0;
        
        // for(int i = 0;i<g.length;i++){
        //     for(int j = 0;j<s.length;j++){
        //         if(g[i]<=s[j]){
        //             greed++;
        //             s[j] = 0;
        //             break;
        //         }
        //     }
        // }
        //optimised code
        // int i = 0;
        // int j = 0;
        // while(i<g.length && j<s.length){
        //     if(g[i]<=s[j]){
        //             greed++;
        //             s[j] = 0;
        //             i++;
        //         }
        //         j++;
        // }
        //more optimised
        int i = g.length - 1;
        int j = s.length - 1;
        while(i>=0 && j>=0){
            if(g[i]<=s[j]){
                    greed++;
                    s[j] = 0;
                    j--;
                }
                i--;
        }
        return greed;
    }
}
