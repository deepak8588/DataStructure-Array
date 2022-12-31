class Solution {
    //solution for https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
    public int[] runningSum(int[] nums) {
       int[] result = new int[nums.length];
       int last_sum=0;
       for(int i=0;i<nums.length;i++){
           if(i==0){
             last_sum = nums[i];
           } else {
              last_sum = nums[i]+ last_sum;
           }
           result[i]=last_sum;
       }
       return result; 
    }
}