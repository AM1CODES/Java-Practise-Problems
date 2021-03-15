import java.util.*;
public class VectorExample1 {
    public static void main(String args[])
    {
        Vector<String> vec = new Vector<String>(10);
        System.out.println(vec.size());

        vec.add("Neel");
        vec.add("Aayush");
        vec.add("Aman");
        vec.add("Aadarsh");
        vec.add("Smit");
        System.out.println(vec.size());
        vec.addElement("Bhumil");
        System.out.println(vec.size());
        System.out.println(vec.indexOf("Smit"));
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        vec.remove(2);
        vec.remove("Smit");
        System.out.println(vec.size());
        Iterator itr = vec.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
}
