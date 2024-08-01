class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String a : details){
            String temp = a.substring(11,13);
            int age = Integer.parseInt(temp);
            if(age>60){
                count++;
            }
        }
        return count;
    }}
