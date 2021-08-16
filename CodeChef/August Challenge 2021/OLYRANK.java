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
	   int g1,s1,b1,g2,s2,b2;
		g1 = sc.nextInt();
		s1 = sc.nextInt();
		b1 = sc.nextInt();
		g2 = sc.nextInt();
		s2 = sc.nextInt();
		b2 = sc.nextInt();
		
		int sum1 = g1+s1+b1;
		int sum2 = g2+s2+b2;
		
		if(sum1>sum2)
		{
		    System.out.println("1");
		}
		else
		{
		    System.out.println("2");
		}
	    }
		
	}
}
