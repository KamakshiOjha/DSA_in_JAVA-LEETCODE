// leetcode - 1750. Minimum Length of String After Deleting Similar Ends
public class L_1750 {
   public static void main(String[] args) {
    String s = "cacaabbaaacc";
    System.out.println(minimumLength(s));
   }
   public static int minimumLength(String s) {
    int n = s.length();
    int count = 0;
    int start = 0;
    int end = s.length()-1; 
    while(start<end && s.charAt(start)==s.charAt(end)){
        char temp = s.charAt(start);
        while(start<=end && s.charAt(start) == temp){
            start++;
        }
        while(start<=end && s.charAt(end) == temp){
            end--;
        }
    }
    count = end - start +1;
    return count;
} 
}
