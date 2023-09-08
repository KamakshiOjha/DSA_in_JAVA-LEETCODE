//coding ninja - Split String
public class Split_String{
    public static void main(String[] args) {
        String str = "codingninjas";
        System.out.println(splitString(str));
    }
    public static Boolean splitString(String str) {
        String[] word = str.split("");
        int n = word.length;
        int left = 0;
        int right = 0;
        for (int i = 0; i < n / 2; i++) {
            if ("aeiouAEIOU".contains(word[i])) {
                left++;
            }
        }
        for (int j = n / 2; j < n; j++) {
            if ("aeiouAEIOU".contains(word[j])) {
                right++;
            }
        }

        return left == right;
    }
    
}
