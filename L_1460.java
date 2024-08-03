class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // optimal 
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0;i<target.length;i++){
            if(target[i] != arr[i]){
                return false;
            }
        }return true;
        // better 
        // HashMap<Integer,Integer> tar = new HashMap<>();
        // HashMap<Integer,Integer> a = new HashMap<>();
        // for(int i = 0;i<target.length;i++){
        //     tar.put(target[i],tar.getOrDefault(target[i],0)+1);
        // }
        // for(int i = 0;i<arr.length;i++){
        //     a.put(arr[i],a.getOrDefault(arr[i],0)+1);
        // }
        // if(tar.equals(a)){
        //     return true;
        // }return false;
    }
}
