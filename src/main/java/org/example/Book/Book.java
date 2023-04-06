package org.example.Book;

import java.util.Arrays;

public class Book {
    private static  int nb;
    private  int id;

    private String name;



    private Auteur[] auteur;

    private Publisher publisher;

    private  int amoutOfPages;

    private double price;
    private int date;
    private CoverType coverType;


    public Book(String name, Auteur[] auteur,Publisher publisher,int date, int amoutOfPages, double price, CoverType coverType) {
        this.id = ++nb;
        this.name = name;
        this.auteur = auteur;
        this.publisher =publisher;

        this.date = date;
        this.amoutOfPages = amoutOfPages;
        this.price = price;
        this.coverType = coverType;
    }

//    public Book[] filterBooksByPublisher( Publisher publisher, Book[] books) {
//
//        }


    public static int getNb() {
        return nb;
    }

    public static void setNb(int nb) {
        Book.nb = nb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auteur[] getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur[] auteur) {
        this.auteur = auteur;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getAmoutOfPages() {
        return amoutOfPages;
    }

    public void setAmoutOfPages(int amoutOfPages) {
        this.amoutOfPages = amoutOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auteur=" + Arrays.toString(auteur) +
                ", publisher=" + publisher +
                ", amoutOfPages=" + amoutOfPages +
                ", price=" + price +
                ", date=" + date +
                ", coverType=" + coverType +
                '}';
    }
}
