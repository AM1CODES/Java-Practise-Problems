import java.security.spec.EllipticCurve;
import java.util.*;
class Employee
{
    String name;
    int emp_id;
    Employee(String name,int emp_id)
    {
        this.name = name;
        this.emp_id = emp_id;
    }
}
public class ArrayDequeueExample {
    public static void main(String args[])
    {
        Deque<Employee> dq = new ArrayDeque<Employee>();
        Employee e1 = new Employee("A", 1);
        Employee e2 = new Employee("B", 2);
        Employee e3 = new Employee("C", 3);
        Employee e4 = new Employee("D", 4);

        dq.add(e1);
        dq.add(e2);
        dq.add(e3);
        dq.add(e4);
        dq.remove(); //removes the head
        System.out.println(dq);

        Iterator itr = dq.iterator();
        while(itr.hasNext())
        {
            Employee e = (Employee)itr.next();
            System.out.println("Employee Name is:" + e.name);
            System.out.println("Employee ID is:" + e.emp_id);
        }

    }
}
