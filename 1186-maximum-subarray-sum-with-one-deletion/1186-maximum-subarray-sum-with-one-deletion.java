class Solution {
    public int maximumSum(int[] arr) {
        int noDel = arr[0];
        int oneDel = Integer.MIN_VALUE;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevNoDel = noDel;

            noDel = Math.max(noDel + arr[i], arr[i]);
            if (oneDel == Integer.MIN_VALUE) {
                oneDel = prevNoDel;
            } else {
                oneDel = Math.max(prevNoDel, oneDel + arr[i]);
            }

            res = Math.max(res, Math.max(noDel, oneDel));

        }
        return res;
    }
}