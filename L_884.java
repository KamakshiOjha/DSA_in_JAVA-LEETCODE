class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str1[] = s1.split(" ");
        String str2[] = s2.split(" ");
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i = 0;i<str1.length;i++){
            hash.put(str1[i],hash.getOrDefault(str1[i],0)+1);
        }
        for(int i = 0;i<str2.length;i++){
            hash.put(str2[i],hash.getOrDefault(str2[i],0)+1);
        }
        for(Map.Entry<String, Integer> entry:hash.entrySet()){
            if(entry.getValue() == 1){
                res.add(entry.getKey());
            }
        }
        String[] arr = new String[res.size()];

        arr = res.toArray(arr);
        return arr;
    }
}
