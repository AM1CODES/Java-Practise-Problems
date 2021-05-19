import java.util.*;

public class LinkedListExample1
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<String>(); //creating linkedlist
        list2.add("Java");
        list2.add("Python");
        list2.add("Julia");
        System.out.println(list2);
        list2.add(3,"C++"); //adding c++ at 3rd index
        System.out.println(list2);
        list2.remove(2); //removing using the index value
        list2.remove("Java"); //removing using the name
        System.out.println(list2);
        }
}