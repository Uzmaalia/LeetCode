class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int posidx = 0, negidx = 1;
    
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
            ans[posidx] = arr[i];
            posidx += 2;
        }
        else {
            ans[negidx] = arr[i];
            negidx += 2;
        }
    }
    return ans;
    }
}