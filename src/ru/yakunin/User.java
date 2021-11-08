package ru.yakunin;

public class User {
    private String FirstName;
    private String LastName;
    private Integer year;

    public User(String lastName, String firstName, Integer year) {
        FirstName = firstName;
        LastName = lastName;
        this.year = year;
    }

    public User(String lastName, String firstName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Integer getYear() {
        return year;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return (this.getLastName() + " " + this.getFirstName() + " " + this.getYear());
    }
}
