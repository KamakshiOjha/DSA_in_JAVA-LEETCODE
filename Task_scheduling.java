//not completed
import java.util.ArrayList;

public class Task_scheduling {
    public static void main(String[] args) {
        int[] deadline = {4, 2, 4, 3, 1, 4, 6};
        int[] penalty = {70, 60, 50, 40, 30, 20, 10};
        int n = deadline.length;
        int net = 0;
        for(int i = 0;i<n;i++){
            net += penalty[i];
        }
        System.out.println(net);
        System.out.println(taskScheduling(deadline, penalty, n , net));
    }

    public static int taskScheduling(int[] deadline, int[] penalty, int n,int net) {
        ArrayList<Integer> total = new ArrayList<>();
        int i = 0;
        int j = 0;
        int s = 0;
        while (i < n && j < n) {
            if (deadline[i] > deadline[j] && s < deadline[j]) {
                total.add(penalty[j]);
                j++;
                s++;
            } else if (deadline[i] == deadline[j] && s <deadline[j]) {
                total.add(penalty[j]);
                if (s <= deadline[i]) {
                    total.add(penalty[i]);
                    i++;
                    s++;
                }
                j++;
                s++;
            } else if (deadline[i] < deadline[j] && s <= deadline[i]) {
                total.add(penalty[i]);
                i++;
                s++;
            }
            i++;
            j++;
            
        }

        int sum = 0;
        for (Integer k : total) {
            sum += k;
        }
        int pentTotal = net - sum;
        return pentTotal;
    }
}
