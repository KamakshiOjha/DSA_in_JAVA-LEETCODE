public class solution {

    // Return the changed string
    public static String removeX(String input){
        if(input.length()==0){
            return input;
        }
        String small = removeX(input.substring(1));
        if(input.charAt(0) == 'x'){
            return small;
        }
        return input.charAt(0)+small ;
    }
}
