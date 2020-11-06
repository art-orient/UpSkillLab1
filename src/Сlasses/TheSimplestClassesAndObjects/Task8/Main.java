package Сlasses.TheSimplestClassesAndObjects.Task8;

import java.util.ArrayList;
import java.util.Collections;

// 8. Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivanov", "Yorik", "Petrovich", "Minsk, Platonova, 4-24",
                2222333344441111L, 12034665887L);
        Customers customers = new Customers();
        customers.addCustomer(customer);
        Customer customer2 = new Customer("Avakov", "Ivan", "Ivanovich", "Gomel, Lenina, 15-4",
                3322332244441111L, 6434034665887L);
        customers.addCustomer(customer2);
        Customer customer3 = new Customer("Borisov", "Alex", "Nikolaevich", "Minsk, Pushkina, 13-2",
                5624332562341165L, 21742434665887L);
        customers.addCustomer(customer3);
        Customer customer4 = new Customer("Nechaev", "Sergey", "Dmitrievich", "Minsk, Serdicha, 1-15",
                7465238662341165L, 852671665887L);
        customers.addCustomer(customer4);
        Customer customer5 = new Customer("Babkina", "Olga", "Dmitrievna", "Minsk, Serdicha, 11-11",
                4268438662341165L, 852671665887L);
        customers.addCustomer(customer5);
        Customer customer6 = new Customer("Trubkina", "Inna", "Anatolievna", "Minsk, Rokossovskogo, 4-22",
                2324238662341165L, 852671665887L);
        customers.addCustomer(customer6);
        Customer customer7 = new Customer("Kuhto", "Sergey", "Sergeevich", "Minsk, Karvata, 10-5",
                1486238662341165L, 852671665887L);
        customers.addCustomer(customer7);
        System.out.println(customers);
        Collections.sort(customers.getCustomers(), new Customer.LastNameComparator());
        System.out.println(customers);
        Collections.sort(customers.getCustomers(), new Customer.CreditCardComparator());
        System.out.println(customers);
        System.out.println(customers.getCreditCard(2000_0000_0000_0000L, 4000_0000_0000_0000L));
    }
}
