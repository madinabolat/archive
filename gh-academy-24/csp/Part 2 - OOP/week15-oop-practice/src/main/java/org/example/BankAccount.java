package org.example;

public class BankAccount {
    String customerName;
    String customerId;
    String accountType;
    Double balance;
    String password;
    Integer pin;

    //default constructor
    BankAccount(){
        this.accountType = "Main";
        this.balance = 0.0;
    }

    //parameterized constructor
    BankAccount(String name){
        this.customerName = name;
    }
    BankAccount(Double balance){
        this.balance = balance;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void printDetails(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account type: " + accountType);
        System.out.println("Current balance: " + balance);
    }

    public void deposit (double amount){
        System.out.println("Deposit action");
        System.out.println("Current balance: " + balance);
        setBalance(getBalance()+amount);
        System.out.println("New balance:" + balance);
    }

    public void withdraw(double amount){
        System.out.println("Withdrawal action");
        System.out.println("Current balance: " + balance);
        setBalance(getBalance()-amount);
        System.out.println("New balance:" + balance);
    }

    public void changePassword(String newPassword){
        System.out.println("You are changing your password");
        this.password = newPassword;
        System.out.println("The password has been changed");
    }

    public void changePin(Integer newPin){
        System.out.println("You are changing your pin");
        this.pin = newPin;
        System.out.println("The pin has been changed");
    }

}
