package Сlasses.TheSimplestClassesAndObjects.Task9;

//    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
public class Book {
    private static int counter = 0;
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;
    private BindingType bindingType;

    public Book(String name, String autors, String publishingHouse, int year, int pages, double price, BindingType bindingType) {
        this.id = ++counter;
        this.name = name;
        this.author = autors;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public Book() {
        this.id = ++counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return String.format("%-3d %-40s %-20s %-18s %d %8d %10.2f    %s",
                id, name, author, publishingHouse, year, pages, price, bindingType);
    }

    public void setYear(int year) {
        if (year > 1445 && year < 2030){
            this.year = year;
        } else {
            System.out.println("");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }
}

