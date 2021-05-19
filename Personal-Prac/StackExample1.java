import java.util.*;
public class StackExample1 {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>(); //stack follows last in first out method
        stack.push("Car"); //adding element to the stack
        stack.push("Bike");
        stack.push("Truck");
        stack.push("Bus");
        System.out.println(stack.peek()); //taking a look at the top most element of the stack
        stack.pop();
        System.out.println(stack.peek());
        boolean b = stack.empty(); //checking if the stack is empty or not
        System.out.println(b);
    }
}
