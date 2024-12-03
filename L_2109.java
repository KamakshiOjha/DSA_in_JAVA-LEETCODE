class Solution {
    public String addSpaces(String s, int[] spaces) {
        String str[] = new String[spaces.length+1];
        int start = 0;
        for(int i = 0;i<spaces.length;i++){
            str[i] = s.substring(start,spaces[i]);
            start = spaces[i]; 
        }
        str[spaces.length] = s.substring(start);
        return String.join(" ", str);
    }
}

// class Solution {
//     public String addSpaces(String s, int[] spaces) {
//         StringBuilder result = new StringBuilder(); 
//         int start = 0;

//         for (int i = 0; i < spaces.length; i++) {
//             result.append(s.substring(start, spaces[i])); 
//             result.append(" "); 
//             start = spaces[i]; 
//         }
//         result.append(s.substring(start)); 
//         return result.toString();
//     }
// }
