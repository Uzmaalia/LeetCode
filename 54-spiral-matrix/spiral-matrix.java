class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length; //row
        int c= matrix[0].length; //col
        int toprow = 0 ;
        int bottomrow = r-1;
        int leftcol = 0;
        int rightcol = c-1;
        int totalele = 0;
        List<Integer> ans= new ArrayList<>();

        while(totalele<r*c){
            //toprow -> leftcol to rightcol
            for(int j=leftcol; j<=rightcol && totalele<r*c; j++){
                ans.add(matrix[toprow][j]);
                totalele++;
            }
            toprow++;

            //rightcol -> toprow to bottomcol
             for(int i=toprow; i<=bottomrow && totalele<r*c; i++){
                ans.add(matrix[i][rightcol]);
                totalele++;
            }
            rightcol--;

            //bottomrow -> rightcol to leftcol
             for(int j=rightcol; j>=leftcol && totalele<r*c; j--){
                ans.add(matrix[bottomrow][j]);
                totalele++;
            }
            bottomrow--;

            //leftcol -> bottomrow to toprow
             for(int i=bottomrow; i>=toprow && totalele<r*c; i--){
                ans.add(matrix[i][leftcol]);
                totalele++;
            }
            leftcol++;

        }
        return ans;

    }
}