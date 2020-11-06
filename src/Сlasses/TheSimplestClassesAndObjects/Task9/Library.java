package Сlasses.TheSimplestClassesAndObjects.Task9;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library(ArrayList<Book> library) {
        this.library = library;
    }

    public Library() {
        library = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        library.add(book);
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        for (Book book : library) {
            output.append(book).append("\n");
        }
        return output.toString();
    }

    public ArrayList<Book> getAuthor(String author){
        ArrayList<Book> sampleAuthor = new ArrayList<Book>();
        for (Book book : library) {
            if (book.getAuthor().equals(author)){
                sampleAuthor.add(book);
            }
        }
        return sampleAuthor;
    }

    public ArrayList<Book> getBinding(BindingType bindingType){
        ArrayList<Book> sampleBinding = new ArrayList<Book>();
        for (Book book : library) {
            if (book.getBindingType().ordinal() == bindingType.ordinal()){
                sampleBinding.add(book);
            }
        }
        return sampleBinding;
    }

    public ArrayList<Book> getPastYear(int year){
        ArrayList<Book> sampleYear = new ArrayList<Book>();
        for (Book book : library) {
            if (book.getYear() >= year){
                sampleYear.add(book);
            }
        }
        return sampleYear;
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }
}
