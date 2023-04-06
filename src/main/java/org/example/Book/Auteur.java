package org.example.Book;

public class Auteur {

    private static  int nb;
    private  int id;

    private  String firstName;
    private  String lastName;

    public Auteur( int id,String firstName, String lastName) {
        this.id = ++nb;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
