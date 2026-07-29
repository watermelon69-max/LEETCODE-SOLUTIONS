class Solution {
    public void func(int index,int nums[] , List<Integer>curr, List<List<Integer>>ls){
        if(index>=nums.length){
            ls.add(new ArrayList<>(curr));
            return;
        }
        //take the element 
        curr.add(nums[index]);
        func(index+1,nums,curr,ls);

        //Backtrack 
        curr.remove(curr.size()-1);

        //not take the element
        func(index+1,nums,curr,ls);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curr = new ArrayList<>();
        List<List<Integer>>ans  = new ArrayList<>();

        func(0,nums,curr,ans); 

        return ans;
        
    }
}