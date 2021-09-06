class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){ //reversing each row in a 2d matrix
            int n = image[i].length;
            int start =0;
            int end = n-1;
            
            while(start<end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        
        for(int j=0;j<image.length;j++){ //inverting all 0s to 1s and vice versa
            for(int j1=0;j1<image[j].length;j1++){
                if(image[j][j1]==0){
                    image[j][j1] = 1;
                }
                else{
                    image[j][j1] = 0;
                }
            }
        }
        return image;
    }
}