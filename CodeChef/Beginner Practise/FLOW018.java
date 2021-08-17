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
	     try {
	         int t = sc.nextInt();
	         while(t-->0)
	         {
	             int num = sc.nextInt();
	             int fact = 1;
	             for(int i=1;i<=num;i++)
	             {
	                 fact = fact*i;
	             }
	             System.out.println(fact);
	             
	         }
	         
	     } catch(Exception e) {
	         return;
	     } 
	    }
}

