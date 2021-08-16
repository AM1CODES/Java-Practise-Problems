/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   	double balance,withdraw;
        Scanner sc=new Scanner (System.in);
        
        withdraw=sc.nextDouble();
        
        balance=sc.nextDouble();
        
        
        if (withdraw%5==0 && withdraw<=balance-0.50){
            balance=balance-(withdraw+0.50);
            System.out.println(balance);
        }
        
        else {
            System.out.println(balance);
        }
	}
}
