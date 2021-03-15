import java.util.*;
class Library{ //Class library
    int bookId;
    String bookName;
    int roll_no;
    Library(int bookId,String bookName,int roll) //constructor of class Library
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.roll_no = roll;
    }
}
public class ArrayListExample3 { //class where we use ArrayList and object of class Library
    public static void main(String args[])
    {
    Library l1 = new Library(111, "Hands on Java", 10);
    Library l2 = new Library(112, "Hands on Julia", 11);
    Library l3 = new Library(113, "Hands on Python", 12);
    Library l4 = new Library(114, "Hands on C++", 13);
    
    ArrayList<Library> arrlist = new ArrayList<Library>();
    arrlist.add(l1);
    arrlist.add(l2);
    arrlist.add(l3);
    arrlist.add(l4);

    System.out.println(arrlist);
    Iterator itr = arrlist.iterator();
    while(itr.hasNext())
    {
        Library lb = (Library)itr.next();
        System.out.println("Book ID = " + lb.bookId);
        System.out.println("Book Name = " + lb.bookName);
        System.out.println("Roll No = " + lb.roll_no);
    }
    
    }
}
