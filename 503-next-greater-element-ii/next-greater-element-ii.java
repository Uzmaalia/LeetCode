class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1; i>=0; i--){
            int idx = i%n;
            int currele = arr[idx];
            while(!st.isEmpty() && st.peek()<=currele){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    ans[idx] = -1;
                }
                else{
                    ans[idx] = st.peek();
                }
            }
            st.push(currele);
        }
        return ans;
    }
}