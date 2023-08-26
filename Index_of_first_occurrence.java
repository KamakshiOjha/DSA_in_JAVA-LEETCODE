//leetcode -  Find the Index of the First Occurrence in a String
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class Index_of_first_occurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return(haystack.indexOf(needle));
        }
        return -1;
    }
}
