import java.util.*;

/*
Simple Railway management system 
Concepts used - inner class, static, this, constructor overloading
*/
public class Railway {

static class Destination
{
    Scanner sc = new Scanner(System.in);
    String start;
    String end;
    String name;
    int train_no;

    Destination(String n,String s,String e)
    {
        this.name = n;
        this.start = s;
        this.end = e;
    }
    Destination(int t)
    {
        this.train_no = t;
    }

    public void accept_user()
    {
        System.out.println("Passenger name:"+name);
        System.out.println("Starting point:"+start);
        System.out.println("Final destination:"+end);
    }
    public void accept_train()
    {
        System.out.println("Train number:"+train_no);
    }
}
    public static void main(String[] args) {
        Destination a = new Destination("Aayush","THN","BPL");
        Destination a1 = new Destination(10150);
        Destination b = new Destination("Aman","RJ","BPL");
        Destination b1 = new Destination(10194);
        Destination c = new Destination("Neel","ANK","BPL");
        Destination c1 = new Destination(10090);
        Destination d = new Destination("Bhumil","ANK","BPL");
        Destination d1 = new Destination(10007);
        Destination e = new Destination("Aadarsh","PON","BPL");
        Destination e1 = new Destination(10156);
        Destination f = new Destination("Smit","AMR","BPL");
        Destination f1 = new Destination(10027);
        
        a.accept_user();
        a1.accept_train();
        b.accept_user();
        b1.accept_train();
        c.accept_user();
        c1.accept_train();
        d.accept_user();
        d1.accept_train();
        e.accept_user();
        e1.accept_train();
        f.accept_user();
        f1.accept_train();
        System.out.println("----------------------------");

        ArrayList<String> passengers = new ArrayList<String>();
        passengers.add(a.name);
        passengers.add(b.name);
        passengers.add(c.name);
        passengers.add(d.name);
        passengers.add(e.name);
        passengers.add(f.name);
        System.out.println("Passengers:"+ passengers);

        ArrayList<String> start_dest = new ArrayList<String>();
        start_dest.add(a.start);
        start_dest.add(b.start);
        start_dest.add(c.start);
        start_dest.add(d.start);
        start_dest.add(e.start);
        start_dest.add(f.start);
        System.out.println("Start Locations:"+start_dest);

        ArrayList<String> end_dest = new ArrayList<String>();
        end_dest.add(a.end);
        end_dest.add(b.end);
        end_dest.add(c.end);
        end_dest.add(d.end);
        end_dest.add(e.end);
        end_dest.add(f.end);
        System.out.println("End Locations:"+end_dest);

        ArrayList<Integer> trains = new ArrayList<Integer>();
        trains.add(a1.train_no);
        trains.add(b1.train_no);
        trains.add(c1.train_no);
        trains.add(d1.train_no);
        trains.add(e1.train_no);
        trains.add(f1.train_no);
        System.out.println("Trains:"+trains);

        System.out.println("----------------------------");

    }
}
