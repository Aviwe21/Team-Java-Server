/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.domain;

/**
 *
 * @author princess
 */
public class Book {
    private int isbn;
    private int shelfNumber;
    //private int add;
    private boolean availableForLoan;
    private double price;
    private String category;
    private String Author;
    private String bookName;

    public Book(int isbn, int shelfNumber, double price, String category, String Author, String bookName) {
        this.isbn = isbn;
        this.shelfNumber = shelfNumber;
        this.price = price;
        this.category = category;
        this.Author = Author;
        this.bookName = bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAvailableForLoan(boolean availableForLoan) {
        this.availableForLoan = availableForLoan;
    }
    
public void isAvailableForLoan(){
this.availableForLoan = availableForLoan;
}

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", shelfNumber=" + shelfNumber + ", availableForLoan=" + availableForLoan + ", price=" + price + ", category=" + category + ", Author=" + Author + ", bookName=" + bookName + '}';
    }
   
  
    
}
