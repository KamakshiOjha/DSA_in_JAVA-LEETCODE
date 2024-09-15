Link - https://www.geeksforgeeks.org/problems/subset-sums2234/1
class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        find(0,n,res,sum,arr);
        Collections.sort(res);
        return res;
    }
    public static void find(int ind, int n,ArrayList<Integer> res , int sum,ArrayList<Integer> arr){
        if(ind == n){
            res.add(sum);
            return;
        }
        find(ind+1,n,res,arr.get(ind)+sum,arr);
        find(ind+1,n,res,sum,arr);
    }
}
