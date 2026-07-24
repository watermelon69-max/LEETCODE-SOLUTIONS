class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder res=new StringBuilder("");
        int n=s.length();
        if(n==0) return "";
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            char c=s.charAt(i);
            if(!st.isEmpty()&&c==st.peek()){
                st.pop();
            }
            else{
                st.push(c);
            }

        }

        while(!st.isEmpty()){
            res.append(st.peek());
            st.pop();
        }
        return res.reverse().toString();
        


    }
}