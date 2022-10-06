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
public class Loan {
    private int loanNumber; //Primary Key
    private int studentNumber; //Foreign Key
    private int isbn; //Foreign Key
    private boolean returnBook;
    private double totalPenaltyCost;

    public Loan(int loanNumber, int studentNumber, int isbn, boolean returnBook, double totalPenaltyCost) {
        this.loanNumber = loanNumber;
        this.studentNumber = studentNumber;
        this.isbn = isbn;
        this.returnBook = returnBook;
        this.totalPenaltyCost = totalPenaltyCost;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isReturnBook() {
        return returnBook;
    }

    public double getTotalCost() {
        return totalPenaltyCost;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setReturnBook(boolean returnBook) {
        this.returnBook = returnBook;
    }

    public void setPenaltyTotalCost(double totalCost) {
        this.totalPenaltyCost = totalCost;
    }

    @Override
    public String toString() {
        return "Loan{" + "loanNumber=" + loanNumber + ", studentNumber=" + studentNumber + ", isbn=" + isbn + ", returnBook=" + returnBook + ", totalPenaltyCost=" + totalPenaltyCost + '}';
    } 
}
