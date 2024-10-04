class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int num[] =Arrays.copyOf(arr, arr.length);;
        Arrays.sort(num);
        HashMap<Integer,Integer> hash = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < num.length; i++) {
            if (!hash.containsKey(num[i])) {
                hash.put(num[i], rank);
                rank++;
            }
        }
        int result[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            result[i] = hash.get(arr[i]);
        }
        return result;

    }
}
