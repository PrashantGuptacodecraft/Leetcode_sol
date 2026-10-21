class Solution {
    public int maxScore(int[] c, int k) {
        int n=c.length;
        for(int i=1;i<n;i++){
            c[i]+=c[i-1];
        }
       if(n==k) return c[n-1];
int i=k-1;
int j=n-1;
int max=-1;
    max=Math.max(c[i],c[j]-c[j-k]);
    i--;

while(i>=0 && j>=n-1-k){
    max=Math.max(max,c[i]+c[n-1]-c[j-1]);
    i--;
    j--;
}

return max;
        
    }
}