/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i=0;i<T;i++)
	    {
	        try {
	            Set<Integer> set = new HashSet<Integer>(); //all elements in a set are unique
	            int[] arr = new int[4];
	            for(int j =0;j<arr.length;j++)
	            {
	                int n =sc.nextInt();
	                arr[j] = n;
	                set.add(n);
	            }
	            int length = set.size(); //stores size of the set
	            
	            if(length==4 || length==3)   // 1 2 3 4 or 2 2 3 4
	            {
	                System.out.println(2);
	            }
	            else if(length==2)
	            {
	                Arrays.sort(arr);
	                if(arr[0]==arr[1] && arr[2]==arr[3])
	                {
	                    System.out.println("2"); // 2 2 2 3
	                }
	                else
	                {
	                    System.out.println("1");
	                }
	            }
	            else
	            {
	                System.out.println("0");
	            }
  
	        } catch(Exception e) {
	            return;
	        }
	    }
	}
}
