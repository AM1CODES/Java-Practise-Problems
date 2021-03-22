import java.util.Scanner;

//import org.graalvm.compiler.hotspot.replacements.StringToBytesSnippets;
public class BankingSystem 
{
    int id;
    String name;
    int acc_bal;
    int amt;
    Scanner sc = new Scanner(System.in);

    void deposit()
    {
        System.out.println("Enter the account ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Account holders name: "); 
        name = sc.nextLine();
        System.out.println("Enter the current account balance: ");
        acc_bal = sc.nextInt();
        System.out.println("Enter the amount to be deposited: ");
        amt = sc.nextInt();

        int final_amt = acc_bal+amt;
        System.out.println("The amount deposited is:" + amt);
        System.out.println("Old acccount balance is:" + acc_bal);
        System.out.println("The new account balance is:" + final_amt);

    }

    void withdraw()
    {
        System.out.println("Enter the account ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Account holders name: "); 
        name = sc.nextLine();
        System.out.println("Enter the current account balance: ");
        acc_bal = sc.nextInt();
        System.out.println("Enter the amount to be withdrawn: ");
        amt = sc.nextInt();

        if (amt>acc_bal)
        {
            System.out.println("Sorry, the bank account has insufficient balance.");
        }
        else
        {
        int final_amt = acc_bal - amt;   
        System.out.println("The amount withdrawn is:" + amt);
        System.out.println("Old acccount balance is:" + acc_bal);
        System.out.println("The new account balance is:" + final_amt);
        }
        
    }
    public static void main(String args[]) 
    {
        Scanner ab = new Scanner(System.in);
        BankingSystem obj = new BankingSystem();    
        System.out.println("Enter the activity you wish to perform: Withdraw/Deposit");
        String input = ab.nextLine();
        if(input.equalsIgnoreCase("Withdraw"))
        {
            obj.withdraw();
        }
        else{
            obj.deposit();
        }
        
    }

}
