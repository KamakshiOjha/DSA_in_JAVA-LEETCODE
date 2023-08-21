//coding_ninja - beautiful string is 010101 , 1010101 etc
public class Beautiful_string {
    public static void main(String[] args) {
        String str = "10001010";
        System.out.println(makeBeautiful(str));

    }
    public static int makeBeautiful(String str) {
        int count = 0;
        String[] s = str.split("");
        for (int i = 0; i < s.length -1; i++) { 
            if (s[i].equals(s[i + 1])) { 
                s[i + 1] = (s[i].equals("0")) ? "1" : "0"; 
                count++;
            }
        }
        return count;
    }
}
