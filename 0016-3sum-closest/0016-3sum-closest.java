class Solution {
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int maxDiff=Integer.MAX_VALUE;
        int resSum=0;
        int n=nums.length;

        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff =Math.abs(sum-target);

                if(diff<maxDiff){
                    maxDiff=diff;
                    resSum=sum;
                }
                if(sum==target) return resSum;
                if(sum<target) j++;
                else k--;
            }
        }
        return resSum;

    }
}