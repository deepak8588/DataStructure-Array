class Solution {
    //Soultion for https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int leftSum=0;
            int rightSum=0;
            //For left sum
            for(int j=i-1;j>=0;j--){
                leftSum+=nums[j];
            }
            //For right sum
            for(int k=i+1;k<nums.length;k++){
                rightSum+=nums[k];
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
}