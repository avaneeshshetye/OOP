import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    Scanner myObj = new Scanner(System.in); 
    public static ArrayList<Account> collection = new ArrayList<Account>();

    public void addAccount(Account acc){
        System.out.println("Account was added");
        collection.add(acc);
    }

    public void removeAccount(){
        System.out.println("Which account do you wanna remove?");
        hover();
        int option_picked = myObj.nextInt();
        collection.remove(option_picked-1);
       // int option_picked_minus_1 = option_picked - 1;
        System.out.println("Account " + option_picked + "deleted");
        System.out.println("Accounts in list");
        hover();
        
    }
    public void depositMoney(){
        System.out.println("Accounts in list");
        hover();
        System.out.println("Pick which one");
        int option_picked_to_Deposit = myObj.nextInt();

        Account acc = collection.get(option_picked_to_Deposit - 1);
        System.out.println("Entered amount to be deposited");
        int amount_to_Be_Deposited = myObj.nextInt();

         acc.money+=amount_to_Be_Deposited;
         System.out.println("Updated List");
         System.out.println(option_picked_to_Deposit + ". " +"Account Name: " + acc.account_name + "," + " Money in account: " + acc.money);

    }

    public void withDraw(){
        System.out.println("Accounts in list");
        hover();
        System.out.println("Pick which one");
        int option_picked_to_Withdraw  = myObj.nextInt();

        Account acc = collection.get(option_picked_to_Withdraw  - 1);
        System.out.println("Entered amount to be withdrawn");
        int amount_to_Be_Withdrawn = myObj.nextInt();

         acc.money-=amount_to_Be_Withdrawn;
         System.out.println("Updated List");
         System.out.println(option_picked_to_Withdraw + ". " +"Account Name: " + acc.account_name + "," + " Money in account: " + acc.money);

    }

    public void hover(){
    System.out.println("Following are the accounts currently in the list");
     for(int i=0; i<collection.size(); i++){

        Account acc = collection.get(i);
        System.out.println(i+1 + ". " +"Account Name: " + acc.account_name + "," + " Money in account: " + acc.money);
        }
    }


}