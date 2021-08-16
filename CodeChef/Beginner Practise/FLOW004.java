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
		int T;
		T = sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int n;
		    int first,last,sum;
		    n = sc.nextInt();
		    last = n%10;
		    while(n>=10)
		    {
		        n = n/10;
		    }
		    first = n;
		    sum = first+last;
		    System.out.println(sum);

		}
	}
}
