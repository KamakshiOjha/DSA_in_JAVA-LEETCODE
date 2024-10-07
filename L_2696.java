class Solution {
    public int minLength(String s) {
        // char str[] = s.toCharArray();
        // int i = 0;
        // for(int j = 0;j<s.length();j++){
        //     if(i>0&&((str[i - 1] == 'A' && str[j] == 'B') || (str[i - 1] == 'C' && str[j] == 'D'))){
        //         i--;
        //     }else{
        //         str[i] = str[j];
        //         i++;
        //     }
        // }
        // return i;

        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char current = s.charAt(i);
            if(!stack.isEmpty() && ((stack.peek() == 'A' && current == 'B') || (stack.peek() == 'C' && current == 'D'))){
                stack.pop();
            }else{
                stack.push(current);
            }
        }
        return stack.size();
    }
}
