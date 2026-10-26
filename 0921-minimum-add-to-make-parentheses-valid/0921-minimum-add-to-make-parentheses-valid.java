class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
               st.push(')');
            }
            else{
                if( st.size()>0 && st.peek()==c){
                    st.pop();
                }
                else count++;
            }

        }
        return count+st.size();
        
    }
}