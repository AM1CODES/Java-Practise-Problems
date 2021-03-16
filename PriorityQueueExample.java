import java.util.*;
public class PriorityQueueExample {
    public static void main(String args[])
    {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.add(1);
    pq.add(2);
    pq.add(3);
    pq.add(4);
    Iterator itr = pq.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }

    pq.remove(); //removes the head
    System.out.println(pq);


}
}
