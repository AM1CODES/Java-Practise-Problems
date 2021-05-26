class Solution{
    public void merge(int[] nums1,int m,int[] nums2, int n)
    {
        m--;
        n--;
        int index = nums1.length - 1;

        while(index>=0)
        {
            if(m<0) //checking for null pointer exception - the pointer may reach the end of the array that is the start position in our case
            {
                nums1[index]  = nums2[n];
                n--;
            }
            else if(n<0)
            {
                nums1[index] = nums1[m];
                m--;
            }
            else{
                if(nums1[m]>nums2[n])
                {
                    nums1[index] = nums1[m];
                    m--;
                }
                else{
                    nums1[index] = nums2[n];
                    n--;
                }
            }
            index--;

        }
    }
}