public class String_palindrome {
    public static void main(String[] args) {
        String str = "c1 O$d@eeD o1c";
        System.out.println(checkPalindrome(str));
    }
    public static boolean checkPalindrome(String str) {

        // String s = str.trim();
		String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String[] arr = s.split("");
        int n = arr.length;
        int mid = n / 2; 

        for (int i = 0; i < mid; i++) {
            int j = n - i - 1;  
            if (!arr[i].equals(arr[j])) {
                return false;
            }
        }
        return true;
    }
}
