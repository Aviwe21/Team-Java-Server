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
public class Learner {
    private int studentNumber;
    private String firstName;
    private String lastName;
    private String Grade;
    private boolean canBorrow;

    public Learner(int studentNumber, String firstName, String lastName, String Grade, boolean canBorrow) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Grade = Grade;
        this.canBorrow = canBorrow;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGrade() {
        return Grade;
    }

    public boolean isCanBorrow() {
        return canBorrow;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public void setCanBorrow(boolean canBorrow) {
        this.canBorrow = canBorrow;
    }

    @Override
    public String toString() {
        return "Learner{" + "studentNumber=" + studentNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", Grade=" + Grade + ", canBorrow=" + canBorrow + '}';
    }
    
    
}
