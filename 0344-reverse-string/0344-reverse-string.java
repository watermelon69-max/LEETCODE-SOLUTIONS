class Solution {
    

    public void recurse(char s[],int l,int h){
        if(l>=h) return ;
        char temp=s[l];
        s[l]=s[h];
        s[h]=temp;
        recurse(s,l+1,h-1);
    }
    public void reverseString(char[] s) {
        recurse(s,0,s.length-1);
       

    }
}