/*
Brute force - 
class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}*/
/*
Optimal - Go through each row of the grid. Apply binary search in each row and increment count. Return count.
*/
class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++){
            int start = 0;
            int end = grid[i].length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(grid[i][mid]<0){
                    count = count + end - mid +1;
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return count;
    }
}