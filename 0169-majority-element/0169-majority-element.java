class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int cdt=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cdt=nums[i];
                cnt++;
            }
            else if(cdt==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        
        }
        return cdt;
    }
}