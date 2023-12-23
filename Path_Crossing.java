// leetcode - 1496. Path Crossing
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Path_Crossing {

    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println("if the path crosses itself at any point : "+isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {
        Map<String, int[]> dir = new HashMap<>();
        dir.put("N", new int[]{0,1});
        dir.put("S", new int[]{0, -1});
        dir.put("E", new int[]{1, 0});
        dir.put("W", new int[]{-1, 0});
        Set<String> visit = new HashSet<>();
        int x =0,y=0;

        for (char c : path.toCharArray()) {
            visit.add("(" + x + ", " + y + ")");
            int[] direction = dir.get(String.valueOf(c));
            x = x + direction[0];
            y = y + direction[1];
            if (visit.contains("(" + x + ", " + y + ")")){
                return true;
            }
        }
        return false;
    }
}
