package org.example;
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setCustomerName("Madina Bolat");
        myAccount.setCustomerId("01");
        myAccount.printDetails();
        myAccount.deposit(10000);
        myAccount.withdraw(500);
        myAccount.changePassword("1995");
        myAccount.changePin(2025);
        myAccount.printDetails();
    }
}