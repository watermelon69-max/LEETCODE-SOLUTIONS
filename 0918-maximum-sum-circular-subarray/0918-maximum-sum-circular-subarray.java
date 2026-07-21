class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxBestEnd=nums[0];
        int minBestEnd=nums[0];
        int ans=nums[0];
        int maxSum=nums[0];
        int minSum=nums[0];
        int totalSum=nums[0];

        for(int i=1;i<nums.length;i++){
            maxBestEnd=Math.max(maxBestEnd+nums[i],nums[i]);
            minBestEnd=Math.min(minBestEnd+nums[i],nums[i]);
            maxSum=Math.max(maxBestEnd,maxSum);
            minSum=Math.min(minBestEnd,minSum);

            totalSum+=nums[i];

        }
        
        int normalMax=maxSum;
        int circularMax=totalSum-minSum;
        if(maxSum<0) return maxSum;

        return Math.max(normalMax,circularMax);

    }
}