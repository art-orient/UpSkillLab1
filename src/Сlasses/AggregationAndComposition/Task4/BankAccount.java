package Сlasses.AggregationAndComposition.Task4;

public class BankAccount {
    private long number;
    private Client owner;
    private boolean isBlock;
    private double balance;

    public BankAccount(Client client, double balance) {
        this.owner = client;
        this.balance = balance;
        this.number = 1_000_000_000_000L + (long)(Math.random() * 9_000_000_000_000L);
        client.getAccounts().add(this);
    }

    public void addMoney(double money){
        balance += money;
        System.out.printf("$ %.2f added to the account, balance of account %d is $ %.2f.\n",
                money, this.number, balance);
    }

    public void takeMoney(double money){
        if (!this.isBlock){
            System.out.println("Account is blocked! Operation is not possible.");
            return;
        }
        balance -= money;
        System.out.printf("Withdrawn $ %.2f, balance of account %d is $ %.2f.\n", money, this.number, balance);
    }

    public void blockAccount (){
        isBlock = true;
        System.out.println("Account " + this.number + " blocked.");
    }

    public void unBlockAccount (){
        isBlock = false;
        System.out.println("Account " + this.number + " unlocked.");
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client client) {
        this.owner = client;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        String status;
        if (isBlock){
            status = "blocked";
        } else {
            status = "not blocked";
        }
        return String.format("Client %s has bank account № %d, balance is $ %.2f, account is %s.",
                owner, number, balance, status);
    }
}
