package org.calculator;
public class Account {

    private String name;
    private Double balance;
    private Double limit;
    private int days;

    public Account (String accountName, Double accountBalance, Double accountLimit, int accountDays) {
        name = accountName;
        balance = accountBalance;
        limit = accountLimit;
        days = accountDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        //supposed to be 75.0
        this.limit = limit;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
