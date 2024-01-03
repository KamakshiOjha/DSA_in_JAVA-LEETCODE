// leetcode - 2125. Number of Laser Beams in a Bank
public class Laser_Beams_in_a_Bank{
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {
        int count = 0;
        int initial = 0;
        int total= 0;
        for(String s : bank){
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            if(initial==0){
                initial = count;
            }else if(initial>0 && count>0){
                total += (initial*count);
                initial = count;
            }count=0;
            
        }
        return total;
    }
}