class Solution {
    public int minimumPushes(String word) {
      // not optimized enough
        HashMap<Character,Integer> hash = new HashMap<>();
        int n = word.length();
        for(int i = 0;i<n;i++){
            hash.put(word.charAt(i),hash.getOrDefault(word.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hash.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        int sum = 0;
        int count = 0;
        for(Map.Entry<Character,Integer> entry: list){
            // if(count<=8){
            //     sum +=entry.getValue();
            //     count++;
            // }else{
            sum += entry.getValue()*(1+count/8);
            count++;
            // }
        }
        return sum;
    }
}
