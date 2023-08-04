import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int [] array = {2,1,6,7,8,4,3,10};
        System.out.println("before sorting");
        printArray(array);
        System.out.println("after sorting");
        int []arr = Merge_sort(array);
        printArray(arr);
    }
    
    public static int[] Merge_sort(int [] array){
        if(array.length==1) return array;

        int midIndex = array.length/2;
        int []left = Merge_sort(Arrays.copyOfRange(array, 0, midIndex));
        int []right = Merge_sort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }
    // return type of the function is arrays of integer type
    public static int[] merge(int[] array1,int[] array2){
        int[] combine = new int[array1.length + array2.length];
        int index = 0;
        int i=0;
        int j=0;
        //compare the two arrays
        while(i<array1.length && j< array2.length){
            if(array1[i] < array2[j]){
                combine[index] = array1[i];
                index++;
                i++; 
            }else{
                combine[index] = array2[j];
                index++;
                j++;
            }
        }
        //if after comparison there are some elements left then they will be added in to the end of combine
        while(i < array1.length){
            combine[index] = array1[i];
            index++;
            i++;
        }
        //if after comparison there are some elements left then they will be added in to the end of combine
        while(j < array2.length){
            combine[index] = array2[j];
            index++;
            j++;
        }
        return combine;
    }

    public static void printArray(int [] array){
        for(int i=0; i<array.length -1;i++){
            System.out.println(array[i]);
        }
    }
}

