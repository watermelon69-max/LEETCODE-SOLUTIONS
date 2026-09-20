class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; //mera first array k 2nd position
        int j=n-1; //nums2 ki last index prr hn 
        int k=m+n-1; // aur ye mere nums1 k last index prr hn 
        

       while(j>=0){
        if( i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];   
        }
        else{
            nums1[k--]=nums2[j--];
        }
       }

    }
}