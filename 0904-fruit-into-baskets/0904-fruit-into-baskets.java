class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int maxNum=Integer.MIN_VALUE;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
        
            while(map.size()>2){ //do hi variety k fruits allowed hai so >2
                map.put(fruits[left],map.get(fruits[left])-1);//shrink until <2

                if(map.get(fruits[left])==0){ //remove the fruits completely from it 
                    map.remove(fruits[left]);
                }
                left++;
            }
            
            maxNum=Math.max(maxNum,right-left+1);

        }
        return maxNum;
    }
}