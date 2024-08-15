class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int change = 0;;
        int n = bills.length;
        for(int i = 0;i<n;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i] == 10 ){
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }
            else{
                if(five>=3){
                    five = five - 3;
                }
                else if(five>0 && ten>0){
                    five--;
                    ten--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
