class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else{
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    }
                 else {
                    stack.push(s.charAt(i));  
                }
            }
        }
        return stack.size();
    }
}
