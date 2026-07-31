class Solution {
    public void findCombination(int index,int target,int arr[], List<Integer>ds,List<List<Integer>>ans ){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i > index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            findCombination(i+1,target-arr[i],arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);
        findCombination(0,target,arr,ds,ans);
        return  ans;
    }
}