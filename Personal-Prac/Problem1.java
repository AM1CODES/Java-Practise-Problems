import java.util.*;
public class Problem1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
    char x = sc.nextLine();
    for(int i=0;i<arr.length;i++){
        if(x==arr[i]){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }

 }
}
