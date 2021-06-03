/* package codechef; // don't place package name! */
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int fdigit = 0;
        int ldigit = 0;
        int n = sc.nextInt();
        int max = 0;

        ldigit = n%10; //last digit

        while(n!=0)
        {
            fdigit = n%10;
            max = Math.max(fdigit,max);
            n = n/10;
        }
        int disc = (fdigit+ldigit)*max;
        System.out.println(disc);
	}
}
