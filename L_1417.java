import java.util.*;

public class L_1417 {
    public static void main(String[] args) {
        String output = reformat("0abc23");
        System.out.println(output);

    }
    public static String reformat(String s) {
        StringBuilder alpha = new StringBuilder();
        StringBuilder digit = new StringBuilder();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                digit.append(ch);
            }else{
                alpha.append(ch);
            }
        }
        int n = alpha.length();
        int m = digit.length();
        int diff = Math.abs(n-m);
        if(diff>1){
            return"";
        }
        boolean flag = n>=m?true:false;
        StringBuilder ans = new StringBuilder();
        int j = 0;
        int k = 0;

        for(int i =0;i<s.length();i++){
            if(flag==true){
                ans.append(alpha.charAt(j++));
            }else{
                ans.append(digit.charAt(k++));
            }
            flag=!flag;
        }
        return ans.toString();
    }
}
