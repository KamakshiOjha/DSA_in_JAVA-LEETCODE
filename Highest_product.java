//FAANG - Highest product of 3 numbers in an array.
public class Highest_product {
    public static void main(String[] args) {
        int[] A = {-5,-2,0,1,1,5};
        System.out.println(product(A));
    }
    public static int product(int[]A){
        int n = A.length;
        int h = A[n-1]*A[n-2]*A[n-3];
        int g = A[0]*A[1]*A[n-1];
        return Math.max(h, g);
    }

}
