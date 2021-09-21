class Solution {
    public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int i = 0; // pointer for children
      int j = 0; // pointer for cookies
      int content = 0;
      while(i < g.length && j < s.length) {
        if(s[j] >= g[i]) {
          content++;
          i++;
          j++;
        } else {
          j++;
        }
      }
      return content;
    }
  }