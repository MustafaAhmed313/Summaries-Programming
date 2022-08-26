/*
11.8: (New Account class) An Account class was specified in Programming
Exercise 9.7. Design a new Account class as follows:
 ■ Add a new data field name of the String type to store the name of the
customer.
 ■ Add a new constructor that constructs an account with the specified name, id,
and balance.
 ■ Add a new data field named transactions whose type is ArrayList
that stores the transaction for the accounts. Each transaction is an instance
of the Transaction class. The Transaction class is defined as shown in
Figure 11.6.
■ Modify the withdraw and deposit methods to add a transaction to the
transactions array list.
 ■ All other properties and methods are the same as in Programming Exercise 9.7.
Write a test program that creates an Account with annual interest rate 1.5%,
balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
account and withdraw $5, $4, and $2 from the account.
Print an account summary that shows account holder name, interest rate, balance, and all transactions.
*/

import java.util.Date;

public class Problem8 {
    public static void main(String[] args){
        Account a1 = new Account(1122 , 1000 , "George");
        a1.setAnnualInterestRate(1.5);
        a1.deposit(30);
        a1.deposit(40);
        a1.deposit(50);
        a1.withDraw(5);
        a1.withDraw(4);
        a1.withDraw(2);
        System.out.printf("""
                Account info:-
                Name : %s
                Interest rate : %2.3f
                Balance : %2.3f
                """ , a1.getName() , a1.getMonthlyInterestRate() , a1.getBalance());
        System.out.println("\n" + a1.getTransactions());
    }
}
class Transaction{
    private Date date;
    private char type;
    private double balance , amount;
    private String description;
    public Transaction(){
    }
    public Transaction(char newType , double newAmount , double newBalance , String newDescription){
        type = newType;
        amount = newAmount;
        balance = newBalance;
        description = newDescription;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public char getType() {
        return type;
    }
    public void setType(char type) {
        this.type = type;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}