class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            int currele = arr[i];
            for(int j=1;j<n;j++){
                int idx = (i+j)%n;
                if(arr[idx]>currele){
                    ans[i] = arr[idx];
                    break;
                }
            } 
        }
        return ans;
    }
}