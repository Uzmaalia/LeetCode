//BETTER
class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int[] hash = new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]] = 1;
        }
        for(int i=0;i<=n;i++){
            if(hash[i]==0) return i;
        }
        return -1;
    }
    
}