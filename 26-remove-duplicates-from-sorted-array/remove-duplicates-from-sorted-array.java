//BRUTE
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> tempSet = new HashSet<>();
        int index = 0;

        for(int num : nums){
            if(!tempSet.contains(num)){
                tempSet.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
}