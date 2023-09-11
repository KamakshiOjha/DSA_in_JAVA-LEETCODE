//linear search
public class Linear_search {
    public static void main(String[] args){
        int[] array = {10,20,30,-11,15,26};
        int target = 30;
        int ans = linear_search(array, target);
        System.out.println(ans);

    }

    static int linear_search(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index =0 ; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        return -1;


    }
}


