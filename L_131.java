class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        find(0,s,res,new ArrayList<>());
        return res;
    }
    public static void find(int ind, String s,List<List<String>> res,List<String> ds){
        if(ind == s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind;i<s.length();i++){
            if(isPal(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                find(i+1,s,res,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static boolean isPal(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
