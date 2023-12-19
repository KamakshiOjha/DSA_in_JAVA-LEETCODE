// leetcode - 661. Image Smoother
public class Image_Smoother {
    public static void main(String[] args) {
        int [][]img = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] result = imageSmoother(img);
        for(int r = 0;r<result.length;r++){
            for(int c = 0;c<result[0].length;c++){
                System.out.print(result[r][c]+" ");
            }System.out.println("\n");
        }
    }
    public static int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int column = img[0].length;
        int[][] result = new int[row][column];
        for(int r = 0;r<row;r++){
            for(int c = 0;c<column;c++){
                int total = 0;
                int count = 0;
                for(int i = r-1;i<=r+1;i++){
                    for(int j = c-1;j<=c+1;j++){
                        if(i<0 || i == row || j<0 || j==column){
                            continue;
                        }
                        total = total+img[i][j];
                        count++;
                    }
                }
                result[r][c] = total/count;
            }
        }


        return result;
    }
//optimised solution
//     public static int[][] imageSmoother(int[][] img) {
//         int row = img.length;
//         int column = img[0].length;
//         // int[][] result = new int[row][column];
//         for(int r = 0;r<row;r++){
//             for(int c = 0;c<column;c++){
//                 int total = 0;
//                 int count = 0;
//                 for(int i = r-1;i<=r+1;i++){
//                     for(int j = c-1;j<=c+1;j++){
//                         if(i<0 || i == row || j<0 || j==column){
//                             continue;
//                         }
//                         total = total+img[i][j] % 256;
//                         count++;
//                     }
//                 }
//                 img[r][c] = img[r][c] ^ (total / count) << 8;
//             }
//         }
//         for(int r = 0;r<row;r++){
//             for(int c = 0;c<column;c++){
//                 img[r][c] = img[r][c]>>8;
//             }}
//         return img;
//     }
}
