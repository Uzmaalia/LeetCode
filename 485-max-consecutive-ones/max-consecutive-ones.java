class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int frequency = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                frequency = Math.max(frequency,count);
            }
            else count =0;
        }
        return frequency;
    }
}