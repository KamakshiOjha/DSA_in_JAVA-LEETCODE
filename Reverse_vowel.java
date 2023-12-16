//leetcode - 345. Reverse Vowels of a String
public class Reverse_vowel {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        int n = s.length();
        char []ch = s.toCharArray();
        int start = 0;
        int end = n - 1;
        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            }
            else if(!isVowel(ch[end])){
                end--;
            }
            else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;

            }
        }
       return String.valueOf(ch);
    }
    public static Boolean isVowel(char ch){
        if(ch == 'a'|| ch == 'e'|| ch=='i'|| ch =='o'|| ch=='u'|| ch=='A'||ch == 'E'|| ch=='I'|| ch =='O'|| ch=='U'){
            return true;
    }
    else{
        return false;
    }

}
}
