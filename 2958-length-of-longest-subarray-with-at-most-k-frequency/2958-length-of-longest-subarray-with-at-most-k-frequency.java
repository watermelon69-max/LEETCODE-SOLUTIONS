class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        int cntLen=Integer.MIN_VALUE;
        HashMap<Integer,Integer>cnt= new HashMap<>(); // count store krunga for checking purpose
        for(int right=0;right<nums.length;right++){
            int ele=nums[right];

            cnt.put(ele,cnt.getOrDefault(ele,0)+1);

        //shrink kruinga if ele cnt exceeds k 
            while(cnt.get(ele)>k){
                cnt.put(nums[left],cnt.get(nums[left])-1);
                left++;

            }
            cntLen=Math.max(cntLen,right-left+1);
        }
        return cntLen;
    }
}