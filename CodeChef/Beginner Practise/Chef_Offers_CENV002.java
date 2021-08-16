import java.util.*;
class main{
  static int f(int n){ //first digit
       while (n >= 10)
            n /= 10;
       return n;
   }
   static int l(int n) { //last digit
       return (n % 10);
    }
    static int m(int n){ //largest digit
      int large= 0;
      while(n != 0){
        int r = n % 10;
        if(r>large)
        {
            large = r;
        }
        n = n / 10;
      }
      return large;
    }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int a=sc.nextInt();
      
      int b=(f(a)+l(a))*m(a);
      if(b>100)
        System.out.println(100);
      else
        System.out.println(b);  
    }
  }
}