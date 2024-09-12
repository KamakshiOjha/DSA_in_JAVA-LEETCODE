class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int n = words.length;
        for(String s : words){
            boolean flag = true;
            for(char c : s.toCharArray()){
                if(!allowed.contains(String.valueOf(c))){
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }
        return count;
    }
}
