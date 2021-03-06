package Сlasses.AggregationAndComposition.Task4;

import Сlasses.TheSimplestClassesAndObjects.Task8.Customer;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;

// 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно.
public class Main {
    public static void main(String[] args) {
        Client ivanov = new Client("Ivanov A.D.");
        BankAccount bankAccount1 = new BankAccount(ivanov, 2000);
        BankAccount bankAccount2 = new BankAccount(ivanov, 500);
        BankAccount bankAccount3 = new BankAccount(ivanov, 15000);
        BankAccount bankAccount4 = new BankAccount(ivanov, 7200);
        BankAccount bankAccount5 = new BankAccount(ivanov, 250);
        bankAccount1.addMoney(880);
        System.out.println(bankAccount1);
        bankAccount5.takeMoney(400);
        System.out.println(bankAccount5);
        bankAccount2.blockAccount();
        System.out.println(bankAccount2);
        bankAccount2.takeMoney(700);
        bankAccount2.unBlockAccount();
        System.out.println(bankAccount2);
        System.out.println("Amount for all accounts is $ " + ivanov.getSumAllAccounts());
        System.out.println("Amount for all accounts, having positive balance is $ " + ivanov.getSumPositiveBalance());
        System.out.println("Amount for all accounts, having negative balance is $ " + ivanov.getSumNegativeBalance());
        Collections.sort(ivanov.getAccounts(), new Client.NumberComparator());
        for (BankAccount account : ivanov.getAccounts()){
            System.out.println(account);
        }
        System.out.println();
        Collections.sort(ivanov.getAccounts(), new Client.BalanceComparator());
        for (BankAccount account : ivanov.getAccounts()){
            System.out.println(account);
        }
    }
}
