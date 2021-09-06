class Solution {
    public int diagonalSum(int[][] mat) {
        //store the final result in this attribute
    int sum =0;
	// this to point the diagonal from right corner, 
    int len = mat.length-1;
	for(int i=0; i<=len; i++){
		//this is to handle the odd square case, where we have to add only once.
        if(i==(len-i))
            sum = sum + mat[i][i];
        else
            sum = sum + mat[i][i] + mat[len-i][i];
    }
    
    return sum;
    }
}

/* Brute force - 
int principal = 0;
   int secondary = 0;
   int sum = 0;
  for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    principal += mat[i][j];
                }
                else if((i+j) == mat.length - 1){
                    secondary += mat[i][j];
                }
                sum = principal + secondary;
            }
        }
        return sum;

*/