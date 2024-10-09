class Solution {
    public boolean checkInclusion(String s1, String s2) {
        StringBuilder str = new StringBuilder(s1);
        List<String> permute = new ArrayList<>();
        getPermutation(permute,s1,0,s1.length());
        for(String s: permute){
            if(s2.contains(s)){
                return true;
            }
        }
        return false;
    }
    public static void getPermutation( List<String> permute,String str, int start, int end){
        if(start == end-1){
            permute.add(str);
        }else  
        {  
            for (int i = start; i < end; i++)  
            {   
                str = swapString(str,start,i);  
                getPermutation(permute,str,start+1,end);  
                str = swapString(str,start,i);  
            }  
        }  
    }
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
}
