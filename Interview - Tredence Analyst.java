import java.util.*;
public class newnp {
    public static void main(String[] args) {
        int[]A = {3,5,10,6,9};
        int N = 5;
        int num = highest(A, N);
        System.out.println(num);
    }
    public static int highest(int []A,int N){
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 2;i<10;i++){
            for(int j = 0;j<N;j++){
                if(A[j]%i == 0){
                    result++;
                }
            }arr.add(i);
            count.add(result);
            result = 0;
        }
        Integer max = Collections.max(count);
        int index = count.indexOf(max);
        return arr.get(index);
    }
}
