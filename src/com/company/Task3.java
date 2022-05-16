package com.company;

class Account{
    String holder,No_Account;
    int balance;
    public Account(String holder, String No_Acc, int balance){
        this.holder = holder;
        this.No_Account=No_Acc;
        this.balance=balance;
    }
    public String getHolder() {return holder;}
    public String getNo_Account() {return No_Account;}
    public int getbalance() {return balance;}
    public void setHolder(String val) {this.holder = val;}
    public void setNo_Account(String val) {this.No_Account = val;}
    public void setbalance(int val) {this.balance = val;}

    public void Transfer(int amount) throws NotEnoughMoneyException{
        if(balance>amount){
            balance-=amount;
        }
        else{
            throw new NotEnoughMoneyException("There is no enough money in your account");
        }
    }

}

public class Task3 {
    public static void main(String[]args) throws NotEnoughMoneyException {
        Account User01 = new Account("Ahmed","0123 1234 2345 3456 4567",7000);
        Account User02 = new Account("Ali","3210 4321 5432 6543 7654",9000);
        try{
            User02.Transfer(6000);
        }
        catch(NotEnoughMoneyException ER){
            System.out.println(ER);
        }
        finally{
            System.out.println("left money is "+User02.balance);
        }

    }

}