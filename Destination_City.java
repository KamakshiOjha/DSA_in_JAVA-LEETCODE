// Leetcode - 1436. Destination City
//You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
//It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Destination_City {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>(Arrays.asList(
                        Arrays.asList("London", "New York"),
                        Arrays.asList("New York", "Lima"),
                        Arrays.asList("Lima", "Sao Paulo")
                ));
        System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List<String> path : paths){
            set.add(path.get(0));
        }
        for(List<String> path : paths){
          if(!set.contains(path.get(1)))  {
              return path.get(1);
          }
        }
        return null;
    }
}     
