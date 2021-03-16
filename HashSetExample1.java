import java.util.*;
public class HashSetExample1 {
    public static void main(String args[])
    {
        HashSet<String> hash = new HashSet<String>(); //hash set only contains unique values and values can't be repeated
        hash.add("Neel");
        hash.add("Aayush");
        hash.add("Aman");
        hash.add("Aadarsh");
        hash.add("Smit");
        System.out.println(hash);
        System.out.println(hash.size());
        hash.remove("Smit");
        Iterator itr = hash.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        hash.clear();
        System.out.println(hash);
        System.out.println(hash.size());


    }
}
