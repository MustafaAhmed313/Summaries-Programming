/*
10.7:se the Account class created in Programming Exercise 9.7 to simulate an ATM machine.
Create ten accounts in an array with id
0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
is accepted, the main menu is displayed as shown in the sample run. You can
enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
depositing money, and 4 for exiting the main menu. Once you exit, the system
will prompt for an id again. Thus, once the system starts, it will not stop.
Enter an id: 4
Main menu

1: check balance
2: withdraw
3: deposit
4: exit

Enter a choice: 1
The balance is 100.0
Main menu

1: check balance
2: withdraw
3: deposit
4: exit

Enter a choice: 2
Enter an amount to withdraw: 3
Main menu

1: check balance
2: withdraw
3: deposit
4: exit

Enter a choice: 1
The balance is 97.0
Main menu

1: check balance
2: withdraw
3: deposit
4: exit

Enter a choice: 3
Enter an amount to deposit: 10
Main menu

1: check balance
2: withdraw
3: deposit
4: exit

Enter a choice: 1
The balance is 107.0
Main menu

1: check balance
2: withdraw
3: deposit
4: exit

Enter a choice: 4
Enter an id:
*/

import java.util.Date;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0 ; i < accounts.length ; i++)
            accounts[i] = new Account(i , 100);
        while(true){
            System.out.println("Enter an id: ");
            int id = input.nextInt();
            if (id != 9 && id != 8 && id != 7 && id != 6 && id != 5
                    && id != 4 && id != 3 && id != 2 && id != 1 && id != 0){
                System.out.println("Enter a correct id: ");
                id = input.nextInt();
            }
            int choice = 0;
            double amount;
            while (choice != 4){
                System.out.println("""
                        Main menu
                        
                        1: check balance
                        2: withdraw
                        3: deposit
                        4: exit
                        
                        Enter a choice:
                        """);
                choice = input.nextInt();
                if (choice == 1)
                    System.out.println("The balance is " + accounts[id].getBalance());
                else if (choice == 2){
                    System.out.println("Enter an amount to withdraw: ");
                    amount = input.nextDouble();
                    accounts[id].withDraw(amount);
                }
                else if ( choice == 3){
                    System.out.println("Enter an amount to deposit: ");
                    amount = input.nextDouble();
                    accounts[id].deposit(amount);
                }
                else
                    break;
            }
        }
    }
}
class Account{
    static Date d = new Date();
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private String dateCreated = d.toString();
    public Account(){
    }
    public Account(int newId , double newBalance){
        id = newId;
        balance = newBalance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getBalance() {
        return balance;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12 / 100;
    }
    public double getMonthlyInterest(){
        return balance * this.getMonthlyInterestRate();

    }
    public void withDraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
