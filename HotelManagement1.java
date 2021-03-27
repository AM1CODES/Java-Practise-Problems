import java.util.*;
public class HotelManagement1 {
static class Hotel //inner class
{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int aadhar;

    Hotel(String n,int age,int aa)
    {
        this.name = n;
        this.age = age;
        this.aadhar = aa;
    }
    Hotel()
    {}
    public void food()
    {
        System.out.println("Would you like to order some food? Select from B/L/D/N");
        String input = sc.nextLine();
        int room_no;
        switch(input)
        {
            case("B"):
                System.out.println("We will be sending in the breakfast shortly. Please provide your room number:");
                room_no = sc.nextInt();
                System.out.println("Breakfast will be delivered to room no" +" "+ room_no);
            break;
            case("L"):
                System.out.println("We will be sending in the Lunch shortly. Please provide your room number:");
                room_no = sc.nextInt();
                System.out.println("Lunch will be delivered to room no" + " "+room_no);
            break;
            case("D"):
                System.out.println("We will be sending in the Dinnner shortly. Please provide your room number:");
                room_no = sc.nextInt();
                System.out.println("Dinner will be delivered to room no:" + " "+room_no);
            break;
            case("N"):
                System.out.println("Feel free to ring us up if you need some food!");
            break;

        }
}
public void laundry()
{
    System.out.println("Do you want laundry service? Select from Y/N");
    sc.nextLine();
    String input = sc.nextLine();
    int room_no;
    switch(input)
    {
        case("Y"):
            System.out.println("Please provide your room number:");
            room_no = sc.nextInt();
            System.out.println("Laundry will be picked from the room" +" "+ room_no);
            break;
        case("N"):
            System.out.println("You can call us for Laundry anytime.");
            break;

    }
}
public static void main(String[] args) {
    Hotel obj = new Hotel("Aayush",19,400607);
    Hotel obj1 = new Hotel("Bhumil",18,400605);
    Hotel obj2 = new Hotel("Neel",20,404607);
    Hotel obj3 = new Hotel("Aman",21,401607);
    Hotel obj4 = new Hotel("Aadarsh",17,401507);
    Hotel obj5 = new Hotel("Smit",17,401507);
    Hotel ht = new Hotel();
    
    
    ArrayList<Hotel> customers = new ArrayList<Hotel>();
    customers.add(obj);
    customers.add(obj1);
    customers.add(obj2);
    customers.add(obj3);
    customers.add(obj4);
    customers.add(obj5);
    System.out.println("Customer Details");
    System.out.println("-----------------");
    Iterator itr = customers.iterator();
    while(itr.hasNext())
    {
        Hotel h = (Hotel)itr.next();
        System.out.println("Name of Customer = " + h.name);
        System.out.println("Customer's age = " + h.age);
        System.out.println("Customer's Aadhar/PAN details = " + h.aadhar);
    }
    ht.food();
    ht.laundry();

}
}
}
    
