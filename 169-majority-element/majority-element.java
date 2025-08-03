class Solution {
    public int majorityElement(int[] arr) {
        //[2,2,1,1,1,2,2]
        //sort->1 1 1 2 2 2 2 
        // Arrays.sort(nums); //built in  sort ->O(nlogn)
        // return nums[nums.length/2];

        int n = arr.length;
        int count = 0;
        int ele =0;
        for(int i=0;i<n;i++){
            if(count==0){
                count = 1;
                ele = arr[i];
            }
            else if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        int num = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele) num++;
        }
        if(num>n/2){
            return ele;
        }
        return -1;
    }
}