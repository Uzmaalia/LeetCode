class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=0;
        if (n == 0) return 0;
        for(int i=0; i<n; i++){
            if (nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            } 

        }
        return k+1; 

    }

   
}