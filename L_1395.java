class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        // for(int i = 0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         for(int k = j+1;k<n;k++){
        //             if((rating[i]<rating[j] && rating[j]<rating[k]) || (rating[i] > rating[j]&&rating[j] > rating[k])){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        int result = 0;
        
        int mid = 1;
        // int i = 1;
        
        while(mid<=n-1){
            int left = 0;
            int right = 0;
            for(int i = 0;i<mid;i++){
                if(rating[i]<rating[mid]){
                    left++;
                } 
            }
            for(int i = mid+1;i<n;i++){
                if(rating[mid]<rating[i]){
                    right++;
                }
            }mid++;
            result = result+(left*right);

        }
        mid = 1;
        while(mid<=n-1){
            int left = 0;
            int right = 0;
            for(int i = 0;i<mid;i++){
                if(rating[i]>rating[mid]){
                    left++;
                } 
            }
            for(int i = mid+1;i<n;i++){
                if(rating[mid]>rating[i]){
                    right++;
                }
            }mid++;
            result = result+(left*right);

        }
        return result;
    }
}
