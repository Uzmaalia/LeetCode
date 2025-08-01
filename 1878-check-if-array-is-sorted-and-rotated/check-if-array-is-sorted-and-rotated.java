class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int deviation = 0;
        for(int i=0; i<n; i++){
            if(i<n-1 && arr[i]>arr[i+1]){
                deviation++;
            }
            else if(i==n-1 && arr[n-1]>arr[0]){
                deviation++;
            }
        }
        return(deviation > 1) ? false : true;
    }
}