class Solution {
  //TC:O(mn) SC:O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix==null)return false;
       int i=0;int j=matrix[0].length-1;
        while(i<matrix.length&&j>=0){
            if(matrix[i][j]==target)return true;
            else if(matrix[i][j]<target)i++;
            else j--;
    }
        return false;
}}