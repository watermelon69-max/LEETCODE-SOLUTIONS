class Solution {
    public void combSum(int index, int target, List<Integer> ds, int arr[], List<List<Integer>> ans) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));

            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            combSum(index, target - arr[index], ds, arr, ans);
            ds.remove(ds.size() - 1);
        }
        combSum(index + 1, target, ds, arr, ans);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combSum(0, target, ds, arr, ans);
        return ans;
    }
}