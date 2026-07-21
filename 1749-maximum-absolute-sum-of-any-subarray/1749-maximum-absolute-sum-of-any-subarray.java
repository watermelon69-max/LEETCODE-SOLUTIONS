class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxBest=nums[0];
        int minBest=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int v1=maxBest+nums[i];
            int v2=minBest+nums[i];
            int v3=nums[i];

            maxBest=Math.max(v1,Math.max(v2,v3));
            minBest=Math.min(v1,Math.min(v2,v3));

            ans=Math.max(ans,Math.max(Math.abs(maxBest),Math.abs(minBest)));
        }
        return Math.abs(ans);
    }
}