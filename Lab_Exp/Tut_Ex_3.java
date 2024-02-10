package OOP.Lab_Exp;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length-1;i++){
            for(int j =i+1; j<nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    // System.out.println(i+j+" = "+target);
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
}

class Tut_Ex_3{
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        Solution S1 =new Solution();
        int[] result = S1.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
        }
    }

