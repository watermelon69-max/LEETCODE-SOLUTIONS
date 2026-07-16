class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCnt = 0;
        int l = 0, r = 0;
        int maxLen = 0;

        for (r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeroCnt++;

            }
            while (zeroCnt > k) {
                if (nums[l] == 0)
                    zeroCnt--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}