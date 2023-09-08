//coding ninja - Convert String
public class Convert_String {
    public static void main(String[] args) {
        String str = "I love programming they are playing cricket good to see you";
        System.out.println(convertString(str));
    }
    public static String convertString(String str) {
        StringBuilder result = new StringBuilder();
        String[] word = str.split(" ");

        for(String s : word){
            if(!s.isEmpty()){
                char first = Character.toUpperCase(s.charAt(0));
                result.append(first).append(s.substring(1)).append(" ");
            }
        }

        return result.toString();
    }
}
