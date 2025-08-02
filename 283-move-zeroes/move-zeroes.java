class Solution {
    public void moveZeroes(int[] nums) {
        //BRUTE
        // int nonZeroIndex=0;
        // int n=nums.length;

        // for(int i=0; i<n; i++){ //replacing zeros with nonzeros
        //     if(nums[i] != 0 ){
        //         nums[nonZeroIndex] = nums[i];
        //         nonZeroIndex++;
        //     }
        // }
        // for(int i=nonZeroIndex; i<n; i++){ //filling zeros at last
        //     nums[i] = 0;
        // }


        //OPTIMAL
        int n = nums.length;
        int j =-1;
        for(int i=0; i<n ; i++){
            if(nums[i]==0){
                j = i;
                break;
            }
        }
        if (j == -1) return;
        for(int i= j+1;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return;   
    }
}