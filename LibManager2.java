import java.util.*;
public class LibManager2 
{
    Scanner sc = new Scanner(System.in);
    String student_name;
    int student_roll;
    String book_name;

    public void accept()
    {
        System.out.println("Enter your name");
        student_name = sc.nextLine();
        System.out.println("Enter your roll no");
        student_roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the book you wish to issue:");
        book_name = sc.nextLine();
        System.out.println("---------------");
    }

    public static void main(String[] args) 
    {
        String[] books = new String[]{"C++", "Java", "C", "Python","Java","Julia","Matlab","Ruby"};
        List<String> booklist = new ArrayList<String>();
        booklist.addAll(Arrays.asList(books));
        
        ArrayList<String> issued_list=new ArrayList<String>();
        ArrayList<String> student_name_list=new ArrayList<String>();
        ArrayList<Integer> student_roll_list=new ArrayList<Integer>();

        LibManager obj = new LibManager();
        obj.accept();

        if(booklist.contains(obj.book_name))
        {
            System.out.println(booklist.size()); //original size of books database
            issued_list.add(obj.book_name);
            booklist.remove(obj.book_name);
            System.out.println(booklist.size()); //updated size of books database when a book is issued to someone

            student_name_list.add(obj.student_name);
            student_roll_list.add(obj.student_roll);

        }
        else
        {   System.out.println("Issue Reciept:");
            System.out.println("---------------");
            System.out.println("Sorry the book cannot be issued. It's currently not available in the Library.");
            System.out.println("---------------");
        }

        System.out.println("Issue Reciept:");
        System.out.println("---------------");
        for(int i =0;i<issued_list.size();i++)
        {
            System.out.println("Name :"+ student_name_list.get(i));
            System.out.println("Roll No :"+ student_roll_list.get(i));
            System.out.println("Book Issued :"+ issued_list.get(i));
            System.out.println("---------------");
        }
        
    }

}
