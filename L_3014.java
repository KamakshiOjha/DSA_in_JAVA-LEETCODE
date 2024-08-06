class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int count = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += 1 *(1+count/8);
            count++;
        }
        return sum;
    }
}
