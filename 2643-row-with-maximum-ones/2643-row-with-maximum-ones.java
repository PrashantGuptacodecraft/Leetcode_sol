class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int max=0;
        int first=0;
        int sec=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){

if(arr[i][j]==1) count++;
if(count>max) first=i;

            }
            if(max<count){
                max=count;
                sec=max;

            }
        }
      return new int[]{first, sec};
    }
}