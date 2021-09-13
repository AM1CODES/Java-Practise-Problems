import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x==y && z%(x+y)==0){
            System.out.println("Its an Orange tree");
        }
        else{
            System.out.println("Not an orange tree");
        }
    }
}
