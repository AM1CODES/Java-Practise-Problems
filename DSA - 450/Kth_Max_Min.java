/*
Approach 1 - Take the array and sort it. Then use the index to get the element that you wish to get.

Approach 2 - Use Heap. Heap helps in using the k that is given in the question. We make a min heap or max heap acccording to the question and insert elements in it. If the size of the heap exceeds k, the top most element is popped.In both min and max heap we will find the answer at the top of the heap.
*/ 
import java.util.*;
public class Kth_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt(); //creating our array using the inputs from user
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        k = sc.nextInt(); //taking K value from the user
            
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); //we are asked to get the kth smallest integer hence we make use of max heap and hencce we use reverse order. default by java is min heap and in this case we need max heap
        for(int i =0;i<n;i++)
        {
            queue.add(arr[i]);
            if(queue.size()>k)
            {
                queue.poll();
            }
            }
            System.out.println(queue.peek());
        }

    }

