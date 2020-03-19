package com.example.nyumon.practice.chap14;

// 14-2
public class Account {
    String accountNumber;
    int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "¥¥" + this.balance + "(口座番号=" + this.accountNumber + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Account) {
            Account a = (Account) obj;
            var accountNumber1 = this.accountNumber.trim();
            var accountNumber2 = a.getAccountNumber().trim();
            return accountNumber1.equals(accountNumber2);
        }
        return false;
    }
}
