/* package codechef; // don't place package name! */
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    try {
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    
		int prod = x*y;
		if(prod>z)
		{
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	        
	    } catch(Exception e) {
	        return;
	    }

       
        }
}
