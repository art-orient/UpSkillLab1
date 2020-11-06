package Сlasses.TheSimplestClassesAndObjects.Task9;

import java.util.ArrayList;

/* 9. Создать класс Book, спецификация которого приведена ниже.
   Определить конструкторы, set- и get- методы и метод  toString().
   Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
   Задать критерии выбора данных и вывести эти данные на консоль.
   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
   Найти и вывести:
   a) список книг заданного автора;
   b) список книг, выпущенных заданным издательством;
   c) список книг, выпущенных после заданного года.
*/
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String heading = "ID     Name                                    Author(s)          "
                + "Publishing House   Year     Pages     Price    Binding Type";
        System.out.println(heading);
        Book book1 = new Book("Murzilka", "Ivanov, Petrov", "Peresvet", 1975, 48, 5.50, BindingType.Saddle_Stitching);
        library.addBook(book1);
        Book book2 = new Book("Java from EPAM", "Blinov, Romanchyk", "4 chetverti", 2020, 560, 35, BindingType.Perfect);
        library.addBook(book2);
        Book book3 = new Book("Java. Methods of programming", "Blinov, Romanchyk", "4 chetverti", 2013, 520, 27.40, BindingType.Perfect);
        library.addBook(book3);
        Book book4 = new Book("The Tale of the Fisherman and the Fish", "Pushkin A.S.", "BelDruk", 1987, 74, 7.60, BindingType.Spiral);
        library.addBook(book4);
        Book book5 = new Book("Eugene Onegin", "Pushkin A.S.", "BelDruk", 2002, 88, 12, BindingType.Perfect);
        library.addBook(book5);
        Book book6 = new Book("Ruslan and Ludmila", "Pushkin A.S.", "SamIzdat", 2015, 48, 6.30, BindingType.Spiral);
        library.addBook(book6);
        Book book7 = new Book("Bronze Horseman", "Pushkin A.S.", "SamIzdat", 2016, 56, 6.70, BindingType.Saddle_Stitching);
        library.addBook(book7);
        System.out.println(library);
        String findAuthor = "Pushkin A.S.";
        ArrayList<Book> sampleAutor = library.getAuthor(findAuthor);
        System.out.println("All books of " + findAuthor + ":");
        System.out.println(heading);
        for (Book book: sampleAutor) {
            System.out.println(book);
        }

        BindingType findBinding = BindingType.Perfect;
        ArrayList<Book> sampleBinding = library.getBinding(findBinding);
        System.out.println("\nAll books of " + findBinding + " binding type:");
        System.out.println(heading);
        for (Book book: sampleBinding) {
            System.out.println(book);
        }

        int findYear = 2001;
        ArrayList<Book> sampleYear = library.getPastYear(findYear);
        System.out.println("\nAll books after " + findYear + " year:");
        System.out.println(heading);
        for (Book book: sampleYear) {
            System.out.println(book);
        }
    }
}