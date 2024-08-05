class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hash = new HashMap<>();
        int n = arr.length;
        for(int i = 0;i<n;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        ArrayList<String> a = new ArrayList<>();
        for (String key : arr) {
            if (hash.get(key) == 1) {
                a.add(key);
            }
        }
        if (k > a.size()) {
            return "";
        }
        return a.get(k - 1);
    }
}
