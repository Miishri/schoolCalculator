package org.calculator;
public class Account {

    private String name;
    private Double balance;
    private Double limit;
    private int days;

    private double leftoverDay;
    public Account (String accountName, Double accountBalance, Double accountLimit, int accountDays) {
        name = accountName;
        balance = accountBalance;
        limit = accountLimit;
        days = accountDays;
        leftoverDay = 0.0;
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
        this.days -= days;
    }

    //ADD COMPLEX CODE
    public void decreaseMoney(Double minusValue) {
            if (minusValue > 0 && minusValue <= 75.0 && days != 0) {
                //Double refer to deduct later
                Double refer = limit;
                setDays(1);

                System.out.println("Balance: " + balance + "kr\nDays left: " + days + " days");
                balance -= minusValue;
                System.out.println("Balance: " + balance + " kr");

                refer -= minusValue;

                if (refer != 0) {
                    leftoverDay += refer;
                    System.out.println("You saved " + Math.round(refer) + " kr (ROUNDED)");
                    System.out.println("You saved " + refer + " kr (REAL)");
                }

                System.out.println("You can use : " + calculateUsage() + " kr");
            }else {
                System.out.println("Value couldn't be processed: " + minusValue + "\nPlease try again!");
            }
    }

    public Double calculateUsage() {
        if ()
        return balance/days;
    }
}