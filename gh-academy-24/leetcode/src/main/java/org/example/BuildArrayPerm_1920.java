package org.example;

public class BuildArrayPerm_1920 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        buildArray(arr);
    }

    public static void buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            ans[i]=nums[nums[i]];
        }
        //return ans;
        for (int el: ans){
            System.out.print(el+" ");
        }
    }

}
