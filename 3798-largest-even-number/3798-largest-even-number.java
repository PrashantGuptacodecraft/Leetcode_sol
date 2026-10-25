class Solution {
    public String largestEven(String s) {
        int n=s.length();
        int last=0;
        String ans="";
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='2'){
                last=i;
                break;
            }
            if(i==0) return ans;
        }
        for(int i=0;i<=last;i++){
            ans+=s.charAt(i);
        }
        return ans;
        
        
    }
}