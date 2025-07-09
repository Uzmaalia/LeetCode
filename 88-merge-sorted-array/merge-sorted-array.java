class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int read1 = m-1;
        int read2 = n-1;
        int write = m + n - 1;

        //filling array from backwards
        while(read1 >= 0 && read2 >= 0){  //for same length array
            if (arr1[read1] > arr2[read2]){
                arr1[write] = arr1[read1];
                read1--;
            }
            else{
                arr1[write] = arr2[read2];
                read2--;
            }
            write--;
        }

        //for unequal length of array
        while(read2 >= 0){
            arr1[write] = arr2[read2];
            read2--;
            write--;
        }
    }
}