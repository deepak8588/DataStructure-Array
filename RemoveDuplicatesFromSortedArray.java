class Solution {
    //LeetCode problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] nums) {
        int unique_count = 1;
        int index = 1;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index] = nums[i];
                unique_count++;
                index++;
            }
        }
        return unique_count;
    }
}