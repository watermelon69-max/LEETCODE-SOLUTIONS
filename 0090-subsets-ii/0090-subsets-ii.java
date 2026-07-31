class Solution {
    public void backTrack(int index,int nums[],List<Integer>current,List<List<Integer>>result){
        result.add(new ArrayList<>(current));

        for(int i=index;i<nums.length;i++){
            if(i > index && nums[i]==nums[i-1]) continue;
            
            current.add(nums[i]);

            //recurse karo for the next index 
            backTrack(i+1,nums,current,result);

            //bakctracking for removing the last element 
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>current =  new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(0,nums,current,result);
        return result;
    }
}