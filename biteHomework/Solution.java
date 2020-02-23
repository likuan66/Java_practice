package biteHomework;

public class Solution {
    public static void main(String[] args) {
        String str="abc";
        String ctr="abcd";
        System.out.println(canConstruct(str,ctr));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(magazine==null||magazine.length()<ransomNote.length()){
            return false;
        }
        if(magazine.contains(ransomNote)){
            return true;
        }else{
            return false;
        }
    }
}
