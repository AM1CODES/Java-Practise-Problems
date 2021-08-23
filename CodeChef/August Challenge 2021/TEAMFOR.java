import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		// your code goes here
		try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-->0){
                int len = sc.nextInt();
                String s1 = sc.next();
                String s2 = sc.next();
                int a=0;
                int b=0;
                for (int i =0;i<len;i++){
                    if (s1.charAt(i)=='1'){
                        a++;
                    }
                    if (s2.charAt(i)=='1'){
                        b++;
                    }
                }
                int k = Math.min(len/2, Math.min(a,b));
                System.out.println(k);

            }
        }
        catch (Exception e ){
            return;
        }
		
	}
}