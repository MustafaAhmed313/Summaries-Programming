/*
9.7: (The Account class) Design a class named Account that contains:
 ■ A private int data field named id for the account (default 0).
 ■ A private double data field named balance for the account (default 0).
 ■ A private double data field named annualInterestRate that stores the current interest rate (default 0).
 Assume all accounts have the same interest rate.
 ■ A private Date data field named dateCreated that stores the date when the
account was created.
 ■ A no-arg constructor that creates a default account.
 ■ A constructor that creates an account with the specified id and initial balance.
 ■ The accessor and mutator methods for id, balance, and annualInterestRate.
 ■ The accessor method for dateCreated.
 ■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
 ■ A method named getMonthlyInterest() that returns the monthly interest.
 ■ A method named withdraw that withdraws a specified amount from the
account.
 ■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class. (Hint: The
method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
is annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g., like 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the (with_draw)
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created
*/

import java.util.Date;
public class Problem7 {
    public static void main(String[] args){
        Account client = new Account();
        client.setBalance(20000);
        client.setId(1122);
        client.setAnnualInterestRate(4.5);
        client.withDraw(2500);
        client.deposit(3000);
        System.out.printf("Client 1 :-\nbalance = $ %2.3f\nMonthly_interest = $ %2.3f\nThe dateCreated : %s"
        , client.getBalance() , client.getMonthlyInterest() , client.getDateCreated());
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
