class Solution { 
    //take 2 sets, check for same elements in both the arrays and just add the elements in the new array and return
    public int[] intersection(int[] a, int[] b) {
    
    HashSet<Integer> set = new HashSet();
    HashSet<Integer> s = new HashSet();
      for(int i: a){
          set.add(i);
      }
      for(int i: b){
          if(set.contains(i)){
              s.add(i);
          }
      } 
        
    //Copy set elements in array
      int[] arr = new int[s.size()];
      int i=0;
      for(int x: s){
          arr[i++]=x;
      }
       return arr; 
        
    }
    }