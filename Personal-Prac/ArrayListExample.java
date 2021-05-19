import java.util.*;
public class ArrayListExample {
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<String>(); //creating our arraylist
        list.add("Java"); //adding elements to the array list
        list.add("Python");
        list.add("Julia");
        list.add("C++");
        list.add(1,"Kotlin"); //adding Kotlin at location 1 in the arraylist
        System.out.println(list); //Output = [Java, Kotlin, Python, Julia, C++]
        Iterator itr  = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()); //Output = Java
                                            //Kotlin
                                            //Python
                                            //Julia
                                            //C++
        }

    }
}
