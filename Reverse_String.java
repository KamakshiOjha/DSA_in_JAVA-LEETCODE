public class Reverse_String {
    public static void main(String[] args) {
        String s = "hello  world i m here";
        System.out.println("The reverse String is: "+reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] input = s.split(" ");
        String[] output = new String[input.length];
        int j = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            output[j] = input[i];
            j++;
        }
        String concat = String.join(" ", output).trim().replaceAll("\\s+", " ");
        return concat;
    }
}
