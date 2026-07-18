class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int right=1;right<nums.length;right++){
            if(nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
            } //i found an unique element

        }
        return left+1;
    }
}