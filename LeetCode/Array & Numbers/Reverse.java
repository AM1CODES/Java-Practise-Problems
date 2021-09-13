class Solution {
    public int reverse(int x) {
            int result = 0;
            while (x != 0)
            {
                int tail = x % 10; //remainder
                int newResult = result * 10 + tail; //reversing the number
                if ((newResult - tail) / 10 != result)
                { 
                    return 0; 
                }
                result = newResult;
                x = x / 10;
            }
    
            return result;
        }
        }