package Сlasses.TheSimplestClassesAndObjects.Task8;

import java.util.Comparator;

public class Customer {
    private static int counter = 0;
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private long creditCard;
    private long bankAccount;

    public Customer(String lastName, String firstName, String patronymic, String address,
                    long creditCard, long bankAccount) {
        this.id = ++counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public Customer(String lastName, String firstName, String patronymic, long creditCard, long bankAccount) {
        this.id = ++counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public Customer(String lastName, String firstName, String patronymic, String address) {
        this.id = ++counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s has ID = %d, lives in %s, has credit card № %d with bank account № %d",
                lastName, firstName, patronymic, id, address, creditCard, bankAccount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        if (Long.toString(creditCard).length() == 16){
            this.creditCard = creditCard;
        } else {
            System.out.println("Incorrect number of credit card");
        }
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    static class LastNameComparator implements Comparator<Customer> {
        @Override
        public int compare (Customer a, Customer b){
            return a.getLastName().compareToIgnoreCase(b.getLastName());
        }
    }

    static class CreditCardComparator implements Comparator<Customer> {
        @Override
        public int compare (Customer a, Customer b){
            if (a.getCreditCard() - b.getCreditCard() < 0){
                return -1;
            } else if (a.getCreditCard() - b.getCreditCard() < 0){
                return 1;
            } else {
                return 0;
            }
        }
    }
}
