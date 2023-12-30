// FAANG
public class Bulbs {
    public static void main(String[] args) {
        int [] A = {1,0,1,0,0,1,1,0};
        System.out.println(bulb_cost(A));
    }
    public static int bulb_cost(int[]A){
        int cost = 0;
        int n = A.length;
        for(int i = 0;i<n;i++){
            if(A[i]==1){
                continue;
            }else{
                A[i] = 1;
                cost++;
                for(int j = i+1;j<n;j++){
                    if(A[j]==1){
                        A[j] = 0;
                    }else{
                        A[j]=1;
                    }
                }
            }
        }
        return cost;
    }
}
