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
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int s1 = sc.nextInt();
	        int s2 = sc.nextInt();
	        int s3 = sc.nextInt();
	        try {
	            if(s2<s3 && s2<s1){
	                System.out.println("Bob");
	            }
	            else if(s3<s2 && s3<s1){
	                System.out.println("Alice");
	            }
	            else{
	                System.out.println("Draw");
	            }
	            
	        } catch(Exception e) {
	            return;
	        }
	    }
	}
}
