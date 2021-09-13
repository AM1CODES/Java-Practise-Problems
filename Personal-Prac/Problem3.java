import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int num = sc.nextInt();

        if(num<=c||num%5==1||num%5==1){
            System.out.println("Mango Tree");
        }
        else{
            System.out.println("Not Mango Tree");
        }
    }
}
