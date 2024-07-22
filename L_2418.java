class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] newname = new String[n];

        HashMap<Integer, String> hash = new HashMap<>();
        for(int i = 0;i<n;i++){
            hash.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j = 0;
        for(int i = n-1;i>=0;i--){
            newname[j] = hash.get(heights[i]);
            j++;
        }
        // for(int i = 0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(heights[i]<heights[j]){
        //             int temp = heights[j];
        //             heights[j] = heights[i];
        //             heights[i] = temp;
        //             String t = names[j];
        //             names[j] = names[i];
        //             names[i] = t;
        //         }
        //     }
        //     newname[i] = names[i];
        // }
        return newname;
    }
}
