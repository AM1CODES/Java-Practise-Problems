import java.util.*;
public class ArrayListExample2 {
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(30);
        list.add(20);
        list.add(47);
        list.add(10);

        Collections.sort(list); //returns sorted list
        System.out.println(list); //Output - [10, 20, 30, 47]
        list.remove(2); //removes the element at the 2nd position
        System.out.println(list);//Output - [10, 20, 47]
        System.out.println((list.get(1))); //prints the element at the 1 position, Output - 20
        list.set(1,90); //Sets the element at 1 position to 90
        System.out.println(list); //Output = [10, 90, 47]

    }
}
