class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int low=0, high=n-1;
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            //if left half is sorted
            if(arr[low]<=arr[mid]){
                ans = Math.min(ans,arr[low]);//storing min val
                low = mid +1;//now eleminating left half
            }
            else{
                ans = Math.min(ans,arr[mid]);
                high = mid -1;
            }
        }
        return ans;
    }
}