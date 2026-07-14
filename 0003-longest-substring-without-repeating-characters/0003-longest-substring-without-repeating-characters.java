class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int maxLen=0;
        HashSet<Character>set=new HashSet<>();
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            while(set.contains(ch)){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(ch);
            maxLen=Math.max(maxLen,high-low+1);
        }
        return maxLen;
    }
}