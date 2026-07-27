class Solution {
    public int maxProduct(int[] nums) {
        int firstNum=0,secondNum=0;

        for(int num:nums){
            if(num>firstNum){
                secondNum=firstNum;
                firstNum=num;
            }
            else if(num>secondNum){
                secondNum=num;
            }
        }
        return (firstNum-1)*(secondNum-1);
    }
}