class Solution {
    public String fractionAddition(String exp) {
        int num = 0;
        int deno = 1;
        int i = 0;
        int n = exp.length();
        while(i<n){
            int currNum = 0;
            int currDeno = 1;
            boolean isNeg = exp.charAt(i)=='-'?true:false;
            if(exp.charAt(i)== '+'||exp.charAt(i)== '-'){
                i++;
            }
            while(i<n && Character.isDigit(exp.charAt(i))){
                currNum = currNum * 10 + (exp.charAt(i) - '0');
                i++;
            }
            currNum = isNeg ? -currNum : currNum; 
            i++;
            while(i<n && Character.isDigit(exp.charAt(i))){
                currDeno = currDeno * 10 + (exp.charAt(i) - '0');
                i++;
            }
            num = num*currDeno + deno*currNum;
            deno = deno*currDeno;
            
            int gcd = Math.abs(gcd(num, deno);
            num /= gcd;
            deno /= gcd;
        }
        return num + "/" + deno;
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }return gcd(b,a%b);
    }
}
