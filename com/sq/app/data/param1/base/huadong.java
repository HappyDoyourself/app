package com.sq.app.data.param1.base;

/**
 * @Author fanht
 * @Description
 * @Date 2021/5/19 10:20 下午
 * @Version 1.0
 */
public class huadong {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4,3};
         System.out.println("**" +minSubArrayLen(7,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength=0;
        int left = 0;
        int sum = 0;
        for(int k = 0;k<nums.length;k++){
            if(nums[k] == target){
                return 1;
            }else{
                //条件判断
                sum +=  nums[k];
                if(sum == target){
                    minLength = minLength == 0 ? (k-left+1):Math.min(minLength,k-left+1);
                }else if(sum >target){
                    sum -= nums[left];
                    left +=1;
                    if(sum == target){
                        minLength = minLength == 0 ? (k-left+1):Math.min(minLength,k-left+1);
                    }
                    while(sum>target){
                        sum -=nums[left];
                        left += 1;
                        if(sum >= target){
                            minLength = minLength == 0 ? (k-left+1):Math.min(minLength,k-left+1);
                        }
                    }
                }
            }

        }
        return minLength;
    }
}
