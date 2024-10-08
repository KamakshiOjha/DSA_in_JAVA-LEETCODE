class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '['){
                stack.push(ch);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        int count = (stack.size()+1)/2;
        return count;
    }
    
}
