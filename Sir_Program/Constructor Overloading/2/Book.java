import java.util.*;
class Book{
    String title,author;
    int isbn;
    double price;
    Book(String title,String author,int isbn,double price){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.price=price;
    }
    Book(int isbn,String author,String title,double price){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
        this.price=price;
    }
    void info(){
        System.out.println("Title :"+ title);
        System.out.println("Author :"+ author);
        System.out.println("Isbn :"+ isbn);
        System.out.println("Price :"+ price);
    }
    public static void main(String[] args) {
        Book b1=new Book("Java","Sagnik",005,300.20);
        Book b2=new Book("OS","Gavlin",456,410.30);
        b1.info();
        b2.info();
        
    }


}