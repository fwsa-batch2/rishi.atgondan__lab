package com.Rishi;

class userData {

    private int AccountNumber;
    private String Password;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        if (password != "  ") {
            this.Password = password;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        userData data = new userData();

        data.setAccountNumber(61783);
        data.setPassword("hello");

        System.out.println("Account number        " + data.getAccountNumber());
        System.out.println("Password      " + data.getPassword());

    }
}