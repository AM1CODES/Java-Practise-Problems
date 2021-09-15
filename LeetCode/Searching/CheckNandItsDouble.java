class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] * 2) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))) return true;
            set.add(arr[i]);
        }
        return false;
    }
}

/*
Brute force
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i =0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                if((arr[i] == arr[j]*2) && i!=j)
                {
                    return true;
                }
            }
            
        }
        return false;
    }
}
*/