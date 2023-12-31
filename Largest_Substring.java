// 1624 - Largest Substring Between Two Equal Characters

public class Largest_Substring{
    public static void main(String[] args) {
        String s = "abcdefa";
        System.out.println(maxLengthBetweenEqualCharacters(s));

    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int maxDistance = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    int currentDistance = j - i - 1;
                    maxDistance = Math.max(maxDistance, currentDistance);
                }
            }
        }

        return maxDistance;
    }

}