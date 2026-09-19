class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; //i will skip the iteration if the element is not alpha numeric
            }
            
        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--; //i will skip the iteration if the element is not alpha numeric
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}