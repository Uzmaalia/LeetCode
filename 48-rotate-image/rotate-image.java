class Solution {
    public void rotate(int[][] arr) {
        //transpose
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //90'rotate->reverse each row
        for (int i = 0; i < n; i++) {
            int a=0,b=n-1;
            //swap arr[i][a] and arr[i][b]
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
    }
}