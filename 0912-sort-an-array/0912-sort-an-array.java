class Solution {
    void merge(int arr[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            merge(arr,low,mid);
            merge(arr,mid+1,high);
            sort(arr,low,mid,high);
        }

    } 
    void sort(int arr[],int low ,int mid,int high){
          int n1=mid-low +1;
          int n2=high-mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[low + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
            int i=0,j=0,k=low;
            while(i<n1 && j<n2){
                if(L[i]<R[j]){
                    arr[k++]=L[i++];
                }
                else{
                    arr[k++]=R[j++];
                }
            }
            while(i<n1){
                arr[k++]=L[i++];
            }
            while(j<n2){
                arr[k++]=R[j++];
            }
    }
    public int[] sortArray(int[] arr) {
        int n=arr.length;
       
    merge(arr,0,n-1);
        return arr;
        
    }
}