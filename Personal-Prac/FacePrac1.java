import java.util.*;
public class MyClass {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int lbr = sc.nextInt(); //10
int bbr = sc.nextInt(); //10
int lsr1 = sc.nextInt(); //5
int bsr1 = sc.nextInt(); //5
int lsr2 = sc.nextInt(); //5
int bsr2 = sc.nextInt(); //5

int area = lbr*bbr; //100
int area2 = lsr1*bsr1 + lsr2*bsr2; //50

if(area2<=area){
System.out.println("Paintings can be fit");
}
else{
System.out.println("Not possible");
}
}
}