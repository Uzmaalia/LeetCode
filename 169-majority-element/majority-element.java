class Solution {
    public int majorityElement(int[] nums) {
        //[2,2,1,1,1,2,2]
        //sort->1 1 1 2 2 2 2 

        Arrays.sort(nums); //built in  sort ->O(nlogn)
        return nums[nums.length/2];
    }
}