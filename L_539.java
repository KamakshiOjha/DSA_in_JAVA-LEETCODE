class Solution {
    public int findMinDifference(List<String> timePoints) {
        int smallest = Integer.MAX_VALUE;
        int []min = new int[timePoints.size()];
        int k = 0;
        for(String str:timePoints){
            min[k] = (Integer.parseInt(str.substring(0,2))*60)+(Integer.parseInt(str.substring(3,5)));
            k++;
        }
        Arrays.sort(min);
        for(int i = 1;i<min.length;i++){
            smallest = Math.min(smallest,(min[i]-min[i-1]));
        }
        smallest = Math.min(smallest, 1440 + min[0] - min[min.length - 1]);
        return smallest;
        
    }
}
