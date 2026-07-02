class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {
        int n=a.length;
        Arrays.sort(a);
       
        Set<List<Integer>>ansSet = new HashSet<>();

        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                HashSet<Long>set = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long needed = (long)target - a[i]-a[j]-a[k];
                    if(set.contains(needed)){
                      List<Integer>ls = Arrays.asList(a[i],a[j],a[k],(int)needed);
                      Collections.sort(ls);
                      ansSet.add(ls);
                    }
                    set.add((long)a[k]);
                    
                }
            }
        }
       
        
        return new ArrayList<>(ansSet);

    }
}