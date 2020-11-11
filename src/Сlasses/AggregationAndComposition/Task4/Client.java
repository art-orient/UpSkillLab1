package Сlasses.AggregationAndComposition.Task4;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<BankAccount> accounts;

    public Client(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public double getSumAllAccounts(){
        double sum = 0;
        for (BankAccount account: this.accounts) {
            sum += account.getBalance();
        }
        return sum;
    }

    public double getSumPlusBalance(){
        double sum = 0;
        for (BankAccount account: this.accounts) {
            if (account.getBalance() > 0) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    public double getSumMinusBalance(){
        double sum = 0;
        for (BankAccount account: this.accounts) {
            if (account.getBalance() < 0) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString (){
        return name;
    }
}
