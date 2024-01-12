// leetcode - 1704. Determine if String Halves Are Alike
import java.util.*;
public class String_Halves_Are_Alike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println("Is Both Halves Alike : " + halvesAreAlike(s));

    }   
    public static boolean halvesAreAlike(String s) {
        char []c = s.toCharArray();
        int n = c.length;
        int mid = (c.length)/2;
        int count1 = 0;
        int count2 = 0;
        if((c.length)%2 == 0 ){
            count1 = count(c,0,mid);
            count2 = count(c,mid,n);
        }else{
            count1 = count(c,0,mid);
            count2 = count(c,mid+1,n);
        }


        return count1==count2;
        }
        private static int count(char[]c ,int start , int end){
            int count = 0;
            for(int i = start;i<end;i++){
            if(c[i] == 'a' ||c[i] == 'e'||c[i] == 'i' || c[i] == 'o'||c[i] == 'u'||c[i] == 'A'||c[i] == 'E'||c[i] == 'I'||c[i] == 'O'||c[i] == 'U'){
                count++;
            }
        }
            return count;
        }
}
