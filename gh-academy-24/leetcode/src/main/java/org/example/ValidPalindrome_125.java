package org.example;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s = "hEllo olleh";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z]","");
        int left = 0;
        int right = s.length()-1;
        while (left<right){
                if (s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        return true;
    }
}
