/*
11.3: (Subclasses of Account) In Programming Exercise 9.7, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw funds.
Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and then implement them. Write
a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods.
*/
import java.util.ArrayList;
import java.util.Date;
public class Problem3 {
    public static void main(String[] args){
        Account a1 = new Account() , a2 = new CheckingAccount() , a3 = new SavingsAccount();
        System.out.printf("""
                a1 %s
                a2 %s
                a3 %s
                """ , a1.toString() , a2.toString() , a3.toString());
    }
}
class CheckingAccount extends Account {
    private double overdraftLimit;
    public CheckingAccount() {
        super();
        overdraftLimit = -20;
    }
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }
    @Override
    public String toString() {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", overdraftLimit);
    }
}
class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println(
                    "Error! Savings account overdrawn transtaction rejected");
    }
}
class Account{
    static Date d = new Date();
    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private String dateCreated = d.toString();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account(){
    }
    public Account(int newId , double newBalance , String newName){
        id = newId;
        balance = newBalance;
        name = newName;
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
        transactions.add(new Transaction('W' , amount , balance , "withdrawal"));
    }
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction('D' , amount , balance , "Deposit"));
    }
}