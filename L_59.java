// class Solution {
//     public int[][] generateMatrix(int n) {
//         if(n==0){
//             return new int[0][0];
//         }
//         int[][]result = new int[n][n];
//         int left = 0;
//         int right = n-1;
//         int top = 0;
//         int bottom = n-1;
//         int index = 0;
//         int count = 1;
//         while(top<=bottom && left<=right){
//             if(index == 0){
//                 for(int i = left;i<=right;i++){
//                     result[top][i] = count++;
//             }
//             top++;
//             }
//             if(index == 1){
//                 for(int i = top;i<=bottom;i++){
//                     result[i][right] = count++;
//             }
//             right--;
//             }if(index == 2){
//                 for(int i = right;i>=left;i--){
//                     result[bottom][i] = count++;
//             }
//             bottom--;
//             }
//             if(index == 3){
//                 for(int i = bottom;i>=top;i--){
//                     result[i][left] = count++;
//             }
//             left++;
//             }
//             index = (index+1)%4;
//         }
//         return result;
//     }
// }


// better:

class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0){
            return new int[0][0];
        }
        int[][]result = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int index = 0;
        int count = 1;
        while(top<=bottom && left<=right){
            // if(index == 0){
                for(int i = left;i<=right;i++){
                    result[top][i] = count++;
            }
            top++;
            // }
            // if(index == 1){
                for(int i = top;i<=bottom;i++){
                    result[i][right] = count++;
            }
            right--;
            // }
            // if(index == 2){
                for(int i = right;i>=left;i--){
                    result[bottom][i] = count++;
            }
            bottom--;
            // }
            // if(index == 3){
                for(int i = bottom;i>=top;i--){
                    result[i][left] = count++;
            }
            left++;
            // }
            index = (index+1)%4;
        }
        return result;
    }
}
