class Solution {
    public int maxValidPairSum(int[] nums, int k) {
         int[] temp = nums;

        int maxLeft = nums[0];
        int ans = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {

            maxLeft = Math.max(maxLeft, nums[j - k]);

            ans = Math.max(ans, maxLeft + nums[j]);
        }

        return ans;
    }
}